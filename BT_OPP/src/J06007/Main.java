// Bang tinh gio chuan
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<MonHoc> limh = new ArrayList<>();
        for(int i=1;i<=n;i++){
            limh.add(new MonHoc(sc.nextLine()));
        }
        int m = Integer.valueOf(sc.nextLine());
        List<GiangVien> ligv = new ArrayList<>();
        for(int i=1;i<=m;i++){
            ligv.add(new GiangVien(sc.nextLine()));
        }
        int k = Integer.valueOf(sc.nextLine());
        ArrayList<BangGioChuan> libgc = new ArrayList<>();
        for(int i=1;i<=k;i++){
            libgc.add(new BangGioChuan(sc.nextLine()));
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
