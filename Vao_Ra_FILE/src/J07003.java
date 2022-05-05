// tach doi va tinh tong
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author LONGDT
 */
public class J07003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length() != 1){
            String dau="";
            String cuoi="";
            for(int i=0;i<s.length()/2;i++){
                dau += s.charAt(i);
            }
            for(int i=s.length()/2;i<s.length();i++){
                cuoi += s.charAt(i);
            }
            BigInteger a = new BigInteger(dau);
            BigInteger b = new BigInteger(cuoi);
            BigInteger sum = a.add(b);
            s = sum.toString();
            System.out.println(s);
        }
    }
}
