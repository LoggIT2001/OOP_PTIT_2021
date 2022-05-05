// So khac nhau trong file 2
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
public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream di = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];
        for(int i=0;i<100000;i++){
            a[di.readInt()]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
