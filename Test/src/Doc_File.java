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
public class Doc_File {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        DataInputStream dis = new DataInputStream(new FileInputStream("TEST.txt"));
        Scanner sc = new Scanner(new File("TEST.txt"));
        while(sc.hasNext()){
            String s = sc.next();
            System.out.println(s);
        }
    }
}
