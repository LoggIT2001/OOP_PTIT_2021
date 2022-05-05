/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010;

import java.util.*;
import java.io.*;
import java.text.ParseException;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        List<SinhVien> li = new ArrayList<>();
        int x = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=x;i++){
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            String gpa = sc.nextLine();
            String tmp="";
            if(i>0 && i<=9){
                tmp = "B20DCCN00" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp = "B20DCCN0" + String.valueOf(i);
            }
            li.add(new SinhVien(tmp, name, lop, ns, gpa));
        }
        for(SinhVien i: li){
            System.out.println(i);
        }
    }
}
