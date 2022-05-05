/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07019;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1,sc2;
        sc1 = new Scanner(new File("DATA1.in"));
        sc2 = new Scanner(new File("DATA2.in"));
        int n = Integer.valueOf(sc1.nextLine());
        ArrayList<SanPham> ALsp = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ALsp.add(new SanPham(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        int m = Integer.valueOf(sc2.nextLine());
        ArrayList<HoaDon> ALhd = new ArrayList<>();
        for(int i=1;i<=m;i++){
            ALhd.add(new HoaDon(i,sc2.nextLine()));
        }
        for(HoaDon hd: ALhd){
            for(SanPham sp: ALsp){
                if(hd.id().equals(sp.getId())){
                    hd.setSp(new SanPham(sp.getId(), sp.getName(), String.valueOf(sp.getDg1()), String.valueOf(sp.getDg2())));
                }
            }
        }
        for(HoaDon hd: ALhd){
            System.out.println(hd);
        }
    }
}
