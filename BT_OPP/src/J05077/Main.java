/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<PhongBan> li1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li1.add(new PhongBan(sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<NhanVien> li2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            li2.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(NhanVien nv: li2){
            for(PhongBan pb: li1){
                if(nv.pb().equals(pb.idPB())){
                    nv.setP(new PhongBan(pb.getStr()));
                }
            }
        }
        for(NhanVien nv: li2){
            System.out.println(nv);
        }
    }
}
