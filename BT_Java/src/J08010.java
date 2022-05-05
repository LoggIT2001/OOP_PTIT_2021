// Tìm tu thuan nghịch dai nhat
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
public class J08010 {
    public static boolean NT(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    
    public static int tim(String s, String[] ds, int n){
        for(int i=0;i<n;i++){
            if(s.equals(ds[i])){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ds = new String[1000];
        int n=0;
        int[] dem = new int[1000];
        while(sc.hasNext()){
            String tmp = sc.next();
            if(NT(tmp)==true){
                int t = tim(tmp,ds,n);
                if(t==-1){
                    ds[n]=tmp;
                    dem[n]=1;
                    n++;
                }else{
                    dem[t]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(ds[i].length() > max){
                max = ds[i].length();
            }
        }
        for(int i=0;i<n;i++){
            if(ds[i].length() == max){
                System.out.println(ds[i] + " " + dem[i]);
            }
        }
    }
}
