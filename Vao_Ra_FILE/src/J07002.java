// Tính tổng
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
public class J07002 {
    public static boolean kt1(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
    public static void main(String[] args) throws IOException, NumberFormatException {
        Scanner sc = new Scanner(new File("DATA.txt"));
        int sum=0;
        while(sc.hasNext()){  
            String s=sc.next();
            if(kt1(s)==true){
                sum+=Integer.parseInt(s);
            }
        }       
        System.out.println(sum);
    }
}
