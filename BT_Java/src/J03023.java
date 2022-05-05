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
public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            String s = sc.next();
            int[] a = new int[1000005];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='I'){
                    a[i]=1;
                }else if(s.charAt(i)=='V'){
                    a[i]=5;
                }else if(s.charAt(i)=='X'){
                    a[i]=10;
                }else if(s.charAt(i)=='L'){
                    a[i]=50;
                }else if(s.charAt(i)=='C'){
                    a[i]=100;
                }else if(s.charAt(i)=='D'){
                    a[i]=500;
                }else if(s.charAt(i)=='M'){
                    a[i]=1000;
                }
            }
            int res = a[s.length()-1];
            for(int i=s.length()-1;i>0;i--){
                if(a[i]>a[i-1]){
                    res-=a[i-1];
                }else if(a[i]==a[i-1] || a[i]<a[i-1]){
                    res+=a[i-1];
                }
            }
            System.out.println(res);
        }
    }
}
