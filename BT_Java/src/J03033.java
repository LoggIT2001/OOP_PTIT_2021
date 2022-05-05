// Boi so chung nho nhat
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.math.*;
/**
 *
 * @author LONGDT
 */
public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger bi1 = new BigInteger(s1);
            BigInteger bi2 = new BigInteger(s2);
            BigInteger GCD = bi1.gcd(bi2);
            BigInteger Mul = bi1.multiply(bi2);
            BigInteger res = Mul.divide(GCD);
            System.out.println(res);
        }
    }
}
