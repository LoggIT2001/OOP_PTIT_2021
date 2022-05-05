/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsachsinhvien1;

import java.util.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> A = (ArrayList<SinhVien>)in.readObject();
        for(SinhVien x: A){
            System.out.println(x);
        }
    }
}
