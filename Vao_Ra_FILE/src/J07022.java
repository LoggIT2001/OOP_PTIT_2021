// loai bo so nguyen
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
public class J07022 {
    public static boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> vt = new Vector<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(isInt(s)==false){
                vt.add(s);
            }
        }
        Collections.sort(vt);
        for(String x: vt){
            System.out.print(x + " ");
        }
    }
}
