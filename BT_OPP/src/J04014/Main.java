/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            long a,b,c,d;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            d = sc.nextLong();
            PhanSo p1 = new PhanSo(a,b);
            PhanSo p2 = new PhanSo(c,d);
            PhanSo p3 = p1.C(p2);
            PhanSo p4 = p1.D(p2);
            p3.rutGon();
            p4.rutGon();
            System.out.println(p3 + " " + p4);
        }
    }
}
