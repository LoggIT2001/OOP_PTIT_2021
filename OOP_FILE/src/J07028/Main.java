/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1, sc2, sc3;
        sc1 = new Scanner(new File("MONHOC.in"));
        sc2 = new Scanner(new File("GIANGVIEN.in"));
        sc3 = new Scanner(new File("GIOCHUAN.in"));
        int n = Integer.valueOf(sc1.nextLine());
        List<MonHoc> limh = new ArrayList<>();
        for(int i=1;i<=n;i++){
            limh.add(new MonHoc(sc1.nextLine()));
        }
        int m = Integer.valueOf(sc2.nextLine());
        List<GiangVien> ligv = new ArrayList<>();
        for(int i=1;i<=m;i++){
            ligv.add(new GiangVien(sc2.nextLine()));
        }
        int k = Integer.valueOf(sc3.nextLine());
        ArrayList<BangGioChuan> libgc = new ArrayList<>();
        for(int i=1;i<=k;i++){
            libgc.add(new BangGioChuan(sc3.nextLine()));
        }
        for(GiangVien gv: ligv){
            float time = 0;
            for(BangGioChuan bgc: libgc){
                if(gv.id().equals(bgc.IdGV())){
                    gv.setBgc(new BangGioChuan(bgc.getS()));
                    time += bgc.time();
                }
            }
            gv.setGio(time);
        }
        
        for(GiangVien gv: ligv){
            System.out.println(gv);
        }
    }
}
