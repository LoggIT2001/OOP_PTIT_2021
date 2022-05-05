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
public class J01016 {
    
    public static boolean chuSo47(String s){
        int four=0;
        int seven=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4'){
                four++;
            }else if(s.charAt(i)=='7'){
                seven++;
            }
        }
        if(four+seven==4){
            return true;
        }
        if(seven+four==7){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(chuSo47(s)==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
