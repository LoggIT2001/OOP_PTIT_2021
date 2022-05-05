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
public class CopyFile {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("TEST1.txt"));
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("TEST2.txt"));
        
        int length;
        byte[] bye = new byte[1024];
        while((length = dis.read(bye))>0){
            dos.write(bye,0,length);
        }
        dos.close();
    }
}
