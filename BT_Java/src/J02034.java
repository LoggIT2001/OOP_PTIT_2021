//bo sung day so
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
public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        int Max=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            Max = Math.max(Max, a[i]);
        }
        int[] b = new int[Max+5];
        for(int i=1;i<=Max;i++){
            b[i]=0;
        }
        for(int i=1;i<=n;i++){
            b[a[i]]=1;
        }
        boolean check = false;
        for(int i=1;i<=Max;i++){
            if(b[i]==0){
                System.out.println(i);
                check = true;
            }
        }
        if(check==false){
            System.out.println("Excellent!");
        }
    }
}
