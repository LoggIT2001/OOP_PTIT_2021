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
public class Ghi_File {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("TEST.txt"));
        String s = "Hoc lap trinh huong doi tuong bang java";
        dos.writeUTF(s);
        dos.close();
    }
}
