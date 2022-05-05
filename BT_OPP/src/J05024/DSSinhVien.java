/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05024;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class DSSinhVien {
    ArrayList<SinhVien> listSv = new ArrayList<>();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSv.add(sv);
        }
        int query = Integer.parseInt(sc.nextLine());
        while(query-- > 0) {
            String nganh = sc.nextLine();
            String tmp = "";
            String st[] = nganh.split(" ");
            for(String x : st) {
                tmp += String.valueOf(x.charAt(0)).toUpperCase();
            }
            tmp = tmp.substring(0, 2);
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() +":");
            
            for(SinhVien x : listSv) {
                if(nganh.equalsIgnoreCase("cong nghe thong tin") || nganh.equalsIgnoreCase("an toan thong tin")) {
                    if(x.getNganh().equalsIgnoreCase(tmp) && !x.getLop().startsWith("E")) {
                        System.out.println(x);
                    }
                } else if(x.getNganh().equalsIgnoreCase(tmp)) {
                    System.out.println(x);
                }
            }
        }
    }
}
