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
public class J01017 {
    
    public static boolean lienKe1(String s){
        for(int i=0;i<s.length()-1;i++){
            if((Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))+1) && (Integer.parseInt(String.valueOf(s.charAt(i))) != Integer.parseInt(String.valueOf(s.charAt(i+1)))-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            String s = sc.next();
            if(lienKe1(s)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
