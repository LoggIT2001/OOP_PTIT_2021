// liet ke cac tu khac nhau
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author LONGDT
 */
public class J07007 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.txt"));
        String s = "";
        Set<String> ms = new TreeSet<>();
        while(sc.hasNext()){
            s+=sc.next() + " " ;
        }
        String tmp = s.toLowerCase();
        String[] x = tmp.split("\\s+");
        for(int i=0;i<x.length;i++){
            if(x[i].length()>0){
                ms.add(x[i]);
            }
        }
        for(String i: ms){
            System.out.println(i);
        }
    }
}
