/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05075;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> a1 = new ArrayList<>();
        List<DiemDanh> a2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            a1.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=1;i<=n;i++){
            a2.add(new DiemDanh(sc.nextLine()));
        }
        for(SinhVien sv: a1){
            for(DiemDanh dd: a2){
                if(sv.getId().equals(dd.id())){
                    sv.setDd(new DiemDanh(dd.getStr()));
                }
            }
        }
        String s = sc.nextLine();
        for(SinhVien sv : a1){
            if(sv.getLop().equals(s)){
                System.out.println(sv);
            }
        }
    }
}
