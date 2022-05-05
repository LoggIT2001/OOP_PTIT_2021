/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008;

import java.util.*;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<MonHoc> A1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            A1.add(new MonHoc(sc.nextLine()));
        }
        int m = Integer.valueOf(sc.nextLine());
        ArrayList<GiangVien> A2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            A2.add(new GiangVien(sc.nextLine()));
        }
        int k = Integer.valueOf(sc.nextLine());
        ArrayList<GioChuan> A3 = new ArrayList<>();
        for(int i=1;i<=k;i++){
            A3.add(new GioChuan(sc.nextLine()));
        }
        for(GioChuan gc: A3){
            for(MonHoc mh: A1){
                if(gc.idMH().equals(mh.idMH())){
                    gc.setMh(new MonHoc(mh.getS()));
                }
            }
        }
        String MaGV = sc.nextLine();
        for(GiangVien gv: A2){
            if(gv.idGV().equals(MaGV)){
                System.out.println("Giang vien: " + gv);
                float tg=0;
                for(GioChuan gc: A3){
                    if(gv.idGV().equals(gc.idGV())){
                        tg+=gc.time();
                        System.out.println(gc);
                    }
                }
                System.out.println("Tong: " + String.format("%.2f", tg));
            }
        }
    }
}
