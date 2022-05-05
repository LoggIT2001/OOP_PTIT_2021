// xau khac nhau dai nhat
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equals(s2)){
                System.out.println("-1");
            }else{
                System.out.println(Math.max(s1.length(), s2.length()));
            }
        }
    }
}
