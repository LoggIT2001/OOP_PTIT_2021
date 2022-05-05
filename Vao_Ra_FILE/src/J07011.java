// thong ke tu khac nhau trong file van ban
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
public class J07011 {  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.txt"));
        String str = "";
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            str+=sc.nextLine() + " ";
        }
        String[] s = str.toLowerCase().split("[\\s+,.?!:;( )-/]");
        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<String> A = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                if(mp.containsKey(s[i])){
                    mp.put(s[i], mp.get(s[i])+1);
                }else{
                    mp.put(s[i], 1);
                    A.add(s[i]);
                }
            }
        }
        Collections.sort(A);
        Collections.sort(A, (String a, String b) -> mp.get(b).compareTo(mp.get(a)));
        for(String x: A){
            System.out.println(x + " " + mp.get(x));
        }
    }
}
