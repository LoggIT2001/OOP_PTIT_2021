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
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        String a = "3 11";
        String b = "3 7 11";
        String c = "6 11";
        String d = "6 7 11";
        A.add(a);
        A.add(b);
        A.add(c);
        A.add(d);
        Collections.sort(A);
        for(String i: A){
            System.out.println(i);
        }
        
    }
}
