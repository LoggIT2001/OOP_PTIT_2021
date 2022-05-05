// Số xa cách
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
public class J02022 {
    public static boolean kt1(int n, int[] x){
        for(int i=1;i<=n;i++){
            if(x[i]==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean kt2(int n, int[] x){
        for(int i=1;i<=n-1;i++){
            if(x[i]==(x[i+1] +1) || x[i]==(x[i+1]-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void result(int n, int[] x){
        if(kt1(n,x)==true && kt2(n,x)){
            for(int i=1;i<=n;i++){
                System.out.print(x[i]);
            }
            System.out.println();
        }
    }
    
    public static void backTrack(int n, int[] x, int i, boolean[] cx){
        for(int j=1;j<=n;j++){
            if(cx[j]){
                x[i]=j;
                cx[j]=false;
                if(i==n){
                    result(n,x);
                }else{
                    backTrack(n,x,i+1,cx);
                }
                cx[j]=true;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            int n = sc.nextInt();
            int[] x = new int[105];
            boolean[] cx = new boolean[105];
            for(int i=1;i<=n;i++){
                cx[i]=true;
            }
            backTrack(n,x,1,cx);
        }
    }
}
