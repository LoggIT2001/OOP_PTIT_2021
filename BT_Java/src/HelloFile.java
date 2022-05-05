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
public class HelloFile {
    public static void main(String[] args) throws IOException{     
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
} 
       
