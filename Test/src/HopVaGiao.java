/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;


public class HopVaGiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] tmp1 = s1.toLowerCase().split("\\s+");
        String[] tmp2 = s2.toLowerCase().split("\\s+");
        //Hop
        Set<String> ms = new TreeSet<>();
        for(int i=0;i<tmp1.length;i++){
            if(tmp1[i].length()>0){
                ms.add(tmp1[i]);
            }
        }
        for(int i=0;i<tmp2.length;i++){
            if(tmp2[i].length()>0){
                ms.add(tmp2[i]);
            }
        }
        for(String i: ms){
            System.out.print(i + " ");
        }
        System.out.println();
        //Giao
        Set<String> ms1 = new TreeSet<>();
        Set<String> ms2 = new TreeSet<>();
        for(int i=0;i<tmp1.length;i++){
            if(tmp1[i].length()>0){
                ms1.add(tmp1[i]);
            }
        }
        for(int i=0;i<tmp2.length;i++){
            if(tmp2[i].length()>0){
                ms2.add(tmp2[i]);
            }
        }
        for(String i: ms1){
            if(ms2.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
