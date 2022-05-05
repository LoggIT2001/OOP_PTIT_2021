// quan ly bai tap nhom
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1,sc2,sc3;
        sc1 = new Scanner(new File("SINHVIEN.in"));
        sc2 = new Scanner(new File("BAITAP.in"));
        sc3 = new Scanner(new File("NHOM.in"));
        List<SinhVien> lisv = new ArrayList<>();
        int n = Integer.valueOf(sc1.nextLine());
        for(int i=1;i<=n;i++){
            lisv.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        List<BaiTap> libt = new ArrayList<>();
        int m = Integer.valueOf(sc2.nextLine());
        for(int i=1;i<=m;i++){
            libt.add(new BaiTap(i, sc2.nextLine()));
        }
        List<Nhom> lin = new ArrayList<>();
        for(int i=1;i<=n;i++){
            lin.add(new Nhom(sc3.nextLine()));
        }
        for(SinhVien sv: lisv){
            for(Nhom x: lin){
                if(sv.getId().equals(x.idSV())){
                    sv.setGroup(new Nhom(x.getS()));
                }
            }
            for(BaiTap bt: libt){
                if(sv.getGroup().stt()==bt.getStt()){
                    sv.setBt(new BaiTap(bt.getStt(), bt.getBt()));
                }
            }
        }
        lisv.sort(Collections.reverseOrder());
        for(SinhVien sv: lisv){
            System.out.println(sv);
        }
    }
}
