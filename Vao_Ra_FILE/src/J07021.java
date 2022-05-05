// chuan hoa xau ho ten trong file
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
public class J07021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.equals("END")){
                break;
            }
            String[] s = str.toLowerCase().split("\\s+");
            String res="";
            for(int i=0;i<s.length;i++){
                if(s[i].length()>0){
                    char[] c = s[i].toCharArray();
                    if(c[0]>96 && c[0]<123){
                        c[0] = (char)(c[0] - 32);
                    }
                    res+=String.valueOf(c) + " ";
                }
            }
            System.out.println(res);
        }
    }
}
