// Xau day du
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
public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.next();
            int k = sc.nextInt();
            boolean[] check = new boolean[1000005];
            for(int i=0;i<1000005;i++){
                check[i]=false;
            }
            for(int i=0;i<s.length();i++){
                check[s.charAt(i)]=true;
            }
            int count=0;
            for(int i='a';i<='z';i++){
                if(!check[i]){
                    count++;
                }
            }
            if(count<=k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
