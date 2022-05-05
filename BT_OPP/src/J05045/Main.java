/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05045;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       ArrayList<NhanVien> ds = new ArrayList<>();
       
       for(int i =1 ;i<=t;i++){
           NhanVien p = new NhanVien(i,sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
           ds.add(p);
           
       }
       Collections.sort(ds);
       for(NhanVien i:ds){
           System.out.println(i);
       }
    }
}
