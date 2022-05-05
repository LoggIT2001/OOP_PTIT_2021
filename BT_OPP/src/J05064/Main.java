/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05064;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<GiaoVien> li = new ArrayList<>();
        int ht=1, hp=1;
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x]=sc.nextLine();
            }
            char[] c = s[0].toCharArray();
            String tmp="";
            tmp=String.valueOf(c[0])+String.valueOf(c[1]);
            if(tmp.equals("HT")){
                if(ht<2){
                    li.add(new GiaoVien(s[0], s[1], s[2]));
                }
                ht++;
            }
            if(tmp.equals("HP")){
                if(hp<3){
                    li.add(new GiaoVien(s[0], s[1], s[2]));
                }
                hp++;
            }
            if(tmp.equals("GV")){
                li.add(new GiaoVien(s[0], s[1], s[2]));
            }
        }
        for(GiaoVien x: li){
            System.out.println(x);
        }
    }
}
