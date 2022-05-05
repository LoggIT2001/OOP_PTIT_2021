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
public class J02019 {
    public static int[] kq = new int[1000005];
    public static void tongUocSo(){
        kq[1]=1;
        for(int i=2;i<=1000000;i++){
            for(int j=i*2;j<=1000000;j+=i){
                kq[j]+=i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int d=0;
        tongUocSo();
        for(int i=a;i<=b;i++){
            if(kq[i]>i){
                d++;
            }
        }
        System.out.println(d);
    }
}
