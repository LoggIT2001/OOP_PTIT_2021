/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04018;

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
            int a,b,c,d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            SoPhuc sp1 = new SoPhuc(a,b);
            SoPhuc sp2 = new SoPhuc(c,d);
            String C = sp1.phC(sp2);
            String D = sp1.phD(sp2);
            System.out.println(C + ", " +D);
        }
    }
}
