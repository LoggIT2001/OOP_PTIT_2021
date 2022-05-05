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
public class J01015 {
    
    public static boolean kiemTra(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2'){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1;t<=test;t++){
            String s = sc.next();
            if(kiemTra(s)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
