// So nguyen to trong file nhi phan
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
public class J07015 {
    public static boolean NT(int x){
        if(x<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.txt"));
        ArrayList<Integer> A = (ArrayList<Integer>)ois.readObject();
        int[] a = new int[1000000];
        for(Integer i: A){
            if(NT(i)==true){
                a[i]++;
            }
        }
        for(int i=0;i<1000000;i++){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
