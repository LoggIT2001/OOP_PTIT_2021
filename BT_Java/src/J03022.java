// Xu ly van ban
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
public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="hahaha. lalaal"
                + "baababa";
//        while(sc.hasNextLine()){
//            s+=sc.nextLine() + " ";
//        }
        String[] tmp = s.toLowerCase().split(".?!");
        for(int i=0;i<tmp.length;i++){
            if(tmp[i].length()>0){
                String[] x =tmp[i].split("\\s+");
                char[] c = x[0].toCharArray();
                if(c[0]>='a' && c[0]<='z'){
                    c[0]-=32;
                }
                System.out.print(String.valueOf(c) + " ");
                for(int j=0;j<x.length;j++){
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
