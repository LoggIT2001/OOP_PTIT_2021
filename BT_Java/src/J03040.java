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
public class J03040 {
    public static boolean KT1(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) >= Integer.parseInt(String.valueOf(s.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }
    public static boolean KT2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }
    public static boolean KT3(String s){
        for(int i=0;i<2;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))){
                return false;
            }
        }
        for(int i=3;i<4;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))){
                return false;
            }
        }
        return true;
    }
    public static boolean KT4(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='6' && s.charAt(i)!='8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            String tmp ="";
            tmp = String.valueOf(c[5]) + String.valueOf(c[6]) + String.valueOf(c[7]) + String.valueOf(c[9]) + String.valueOf(c[10]);
            if(KT1(tmp)==true || KT2(tmp)==true || KT3(tmp)==true || KT4(tmp)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
