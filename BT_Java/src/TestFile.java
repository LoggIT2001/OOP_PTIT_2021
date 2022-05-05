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
public class TestFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LoggIT.txt"));
        PrintWriter out = new PrintWriter(new File("KQ.txt"));
        int t=0;
        while(sc.hasNextInt()){
            t+=sc.nextInt();
        }
        out.print(t);
        out.close();
        System.out.println(t);
    }
}
