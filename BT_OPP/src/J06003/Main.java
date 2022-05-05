// quan li btn 1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

import java.util.*;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn=sc.nextInt();
        int sbt=sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> A1 = new ArrayList<>();
        for(int i=0;i<sn;i++){
            A1.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), new Nhom(Integer.parseInt(sc.nextLine()))));
        }
        ArrayList<Nhom> A2 = new ArrayList<>();
        for(int i=1;i<=sbt;i++){
            A2.add(new Nhom(i, sc.nextLine()));
        }
        int n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            int t = Integer.valueOf(sc.nextLine());
            System.out.println("DANH SACH NHOM " + t + ":");
            for(SinhVien sv: A1){
                if(sv.getGroup().getStt()==t){
                    System.out.println(sv);
                }
            }
            String res="";
            for(Nhom x: A2){
                if(x.getStt()==t){
                    res=x.getName();
                    break;
                }
            }
            System.out.println("Bai tap dang ky: " + res);
        }
    }
}
