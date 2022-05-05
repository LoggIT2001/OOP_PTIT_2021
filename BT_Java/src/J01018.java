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
public class J01018 {
    
    public static boolean lienKe(String s){
        for(int i=0;i<s.length()-1;i++){
            if((Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))+2) && (Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))-2)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean tongChuSo(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(sum%10==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            if(lienKe(s)==true && tongChuSo(s)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
