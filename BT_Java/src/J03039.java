//chia het
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            BigInteger a = new BigInteger(tmp[0]);
            BigInteger b = new BigInteger(tmp[1]);
            BigInteger res1 = a.mod(b);
            BigInteger res2 = b.mod(a);
            BigInteger kt = new BigInteger("0");
            if(res1.compareTo(kt)==0 || res2.compareTo(kt)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
