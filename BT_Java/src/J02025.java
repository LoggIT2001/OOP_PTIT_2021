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
public class J02025 {
    public static int[] a = new int[25];
    public static int[] b = new int[25];
    public static int n;
    
    public static boolean NT(int m){
        if(m<2) return false;
        for(int i=2;i<=Math.sqrt(m);i++)
            if(m%i==0) return false;
        return true;
    }
    public static void result(){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(a[i]*b[i]);
        }
        if(NT(sum)==true){
            for(int i=1;i<=n;i++){
                if(a[i]==1){
                    System.out.print(b[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void Try(int i){
        for(int j=0;j<=1;j++)
        {
            a[i]=j;
            if(i==n){
                result();
            }else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            n = sc.nextInt();
            for(int i=1;i<=n;i++){
                b[i]=sc.nextInt();
            }
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    if(b[i]<b[j]){
                        int temp=b[i];
                        b[i]=b[j];
                        b[j]=temp;
                    }
                }
            }
            Try(1);
        }
    }
}
