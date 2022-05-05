//So khac nhau trong file 1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J07004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[]  a = new int[100000];
        while(sc.hasNextInt()){
            a[sc.nextInt()]++;
        }
        for(int i=0;i<=1000;i++){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
