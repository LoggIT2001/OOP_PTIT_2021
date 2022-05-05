// tinh toan hoa don ban quan ao
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        ArrayList<SanPham> ALsp = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ALsp.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.valueOf(sc.nextLine());
        ArrayList<HoaDon> ALhd = new ArrayList<>();
        for(int i=1;i<=m;i++){
            ALhd.add(new HoaDon(i,sc.nextLine()));
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
