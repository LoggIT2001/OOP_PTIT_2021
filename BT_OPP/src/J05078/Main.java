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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSPhongBan dsPB = new DSPhongBan();
        DSNhanVien dsNV = new DSNhanVien();
        dsPB.input(sc);
        dsNV.input(sc);
        
        String maPhong = sc.nextLine();
        
        System.out.println("Bang luong phong" + dsPB.searchName(maPhong) + ": ");
        
        dsNV.searchNV(maPhong);
        
        
    }
}
