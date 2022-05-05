/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05029;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class DSDoanhNghiep {
    ArrayList<DoanhNghiep> listDN = new ArrayList<>();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            listDN.add(dn);
        }
        sapXep();
        int query = Integer.parseInt(sc.nextLine());
        while(query-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            sc.nextLine();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:" );
            for (DoanhNghiep dn : listDN) {
                if(dn.getSoSV() >= a && dn.getSoSV() <= b) {
                    System.out.println(dn);
                }
            }
        }
    }
    
    public void sapXep() {
        Collections.sort(listDN, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if(o1.getSoSV() > o2.getSoSV()) {
                    return -1;
                } else if(o1.getSoSV() < o2.getSoSV()) {
                    return 1;
                } else {
                    return o1.getMaDN().compareToIgnoreCase(o2.getMaDN());
                }
            }
        });
    }
}
