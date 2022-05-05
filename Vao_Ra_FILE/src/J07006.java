// So khac nhau trong file 3
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
public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream di = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>)di.readObject();
        int[] a = new int[1000];
        for(Integer i: ds){
            a[i]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
