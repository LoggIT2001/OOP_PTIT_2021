/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05078;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class DSNhanVien {
    ArrayList<NhanVien> listNV = new ArrayList<>();
    
    public void input(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < n; i++) {
            NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            
            listNV.add(nv);
        }
    }
    
    public void searchNV(String maPB) {
        for(NhanVien nv : listNV) {
            if(nv.getMaNV().endsWith(maPB)) {
                System.out.println(nv);
            }
        }
    }
}
