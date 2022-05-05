/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07018;

import java.util.*;
import java.io.*;
import java.text.ParseException;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        List<SinhVien> li = new ArrayList<>();
        int x = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=x;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            String gpa = sc.nextLine();
            String s="";
            if(i>0 && i<=9){
                s = "B20DCCN00" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                s = "B20DCCN0" + String.valueOf(i);
            }
            li.add(new SinhVien(s, name, lop, ns, gpa));
        }
        for(SinhVien i: li){
            System.out.println(i);
        }
    }
}
