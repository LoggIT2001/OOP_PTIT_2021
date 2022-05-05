/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07047;

import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException,ParseException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<KhachHang> kh = new ArrayList<>();
        ArrayList<LoaiPhong> lp = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=m;i++){
            LoaiPhong tmp = new LoaiPhong(sc.nextLine());
            lp.add(tmp);
        }
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            KhachHang tmp = new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            kh.add(tmp);
        }
        for(KhachHang i:kh){
            for(LoaiPhong j:lp){
                if(i.getMaphong().equals(j.getKihieu())){
                    double tongtien ;
                    //= (1+j.getPhiPhucVu())*(i.getLuutru()*j.getDonGiaNgay());
                    if(i.getLuutru()==0){
                        tongtien = (1+j.getPhiPhucVu())*j.getDonGiaNgay();
                    }
                    else tongtien = (1+j.getPhiPhucVu())*(i.getLuutru()*j.getDonGiaNgay());
                    double giamgia = 0;
                    long c = i.getLuutru();
                    if(c<10) giamgia=0;
                    else if(c>=10&&c<20) giamgia = tongtien*0.02;
                    else if(c>=20&&c<30) giamgia = tongtien*0.04;
                    else giamgia = tongtien*0.06;
                    tongtien = tongtien -giamgia;
                     tongtien = Math.round(tongtien*100.00)/100.00;
                    i.setTongtien(tongtien);
                }
            }
        }
        Collections.sort(kh);
        for(KhachHang i:kh){
            System.out.println(i);
        }
    }
}
