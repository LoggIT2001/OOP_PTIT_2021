// bo 3 so Pytago
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
public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            int check=0;
            long x,y,z;
            for(int i=0;i<n;i++){
                a[i]=(a[i]*a[i]);
            }
            for(int i=0;i<n;i++){
                int left = n-2, right = n-1;
                x = a[i];
                while(left > i){
                    y = a[left];
                    z = a[right];
                    long k = z-y;
                    if(k==x){
                        check = 1;
                        left++;right--;
                    }else if(k>x){
                        right--;
                    }else{
                        left--;
                    }
                }
            }
            if(check==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
