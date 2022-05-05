/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07024;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class WordSet {
    private File fl;

    public WordSet() {
    }

    public WordSet(String s) {
        this.fl = new File(s);
    }
    public String difference(WordSet x) throws IOException{
        Scanner sc1, sc2;
        sc1 = new Scanner(this.fl);
        sc2 = new Scanner(x.fl);
        Set<String> ms1 = new TreeSet<>();
        Set<String> ms2 = new TreeSet<>();
        String s1="";
        String s2="";
        while(sc1.hasNext()){
            s1+=sc1.next() + " ";
        }
        String[] tmp = s1.toLowerCase().split("\\s+");
        for(int i=0;i<tmp.length;i++){
            if(tmp[i].length()>0){
                ms1.add(tmp[i]);
            }
        }
        while(sc2.hasNext()){
            s2+=sc2.next() + " ";
        }
        String[] tmp2 = s2.toLowerCase().split("\\s+");
        for(int i=0;i<tmp2.length;i++){
            if(tmp2[i].length()>0){
                ms2.add(tmp2[i]);
            }
        }
        String res="";
        for(String i: ms1){
            if(ms2.contains(i)==false){
                res+=i + " ";
            }
        }
        return res;
    }   

}
