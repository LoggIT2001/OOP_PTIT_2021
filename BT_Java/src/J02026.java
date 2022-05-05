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
public class J02026 {
    public static int[] a = new int[25];
    public static int[] b = new int[25];
    public static int n,k;
    
    public static void result(){
        for(int i=1;i<=k;i++){
            System.out.print(b[a[i]]+" ");
        }
        System.out.println("");
    }
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n+i-k;j++){
            a[i]=j;
            if(i==k){
                result();
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            n = sc.nextInt();
            k = sc.nextInt();
            a[0] = 0;
            for(int i=1;i<=n;i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(b,1,n+1);
            Try(1);
        }
    }
}
