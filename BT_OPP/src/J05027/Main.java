/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<GiangVien> li = new ArrayList<>();
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String res="";
            if(t>0 && t<=9){
                res="GV0"+String.valueOf(t);
            }else if(t>=10 && t<=99){
                res="GV"+String.valueOf(t);
            }
            String[] s = new String[2];
            for(int i=0;i<2;i++){
                s[i]=sc.nextLine();
            }
            li.add(new GiangVien(res, s[0], s[1]));
        }
        int n= Integer.valueOf(sc.nextLine());
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String tmp = s.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GiangVien x: li){
                String name = x.getName().toLowerCase();
                if(name.contains(tmp)==true){
                    System.out.println(x);
                }
            }
        }
    }
}
