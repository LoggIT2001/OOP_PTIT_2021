/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06004;

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
        for(SinhVien sv: A1){
            for(Nhom x: A2){
                if(sv.getGroup().getStt()==x.getStt()){
                    sv.setGroup(new Nhom(x.getStt(), x.getName()));
                }
            }
        }
        Collections.sort(A1, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(SinhVien sv : A1) {
            System.out.println(sv);
        }
    }
}
