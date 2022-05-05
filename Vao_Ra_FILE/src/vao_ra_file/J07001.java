// Doc File Van Ban
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vao_ra_file;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J07001 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
