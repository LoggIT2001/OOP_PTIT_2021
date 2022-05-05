/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04022;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class WordSet {
    private String s;
    
    public WordSet(){
        
    }
    public WordSet(String s){
        this.s = s;
    }
    public String union(WordSet b){
        Set<String> ms = new TreeSet<>();
        String[] s1 = this.s.toLowerCase().split("\\s+");
        for(int i=0;i<s1.length;i++){
            if(s1[i].length()>0){
                ms.add(s1[i]);
            }
        }
        String[] s2 = b.s.toLowerCase().split("\\s+");
        for(int i=0;i<s2.length;i++){
            if(s2[i].length()>0){
                ms.add(s2[i]);
            }
        }
        String res="";
        for(String i: ms){
            res+=i + " ";
        }
        return res;
    }
    public String intersection(WordSet b){
        Set<String> ms1 = new TreeSet<>();
        Set<String> ms2 = new TreeSet<>();
        String[] s1 = this.s.toLowerCase().split("\\s+");
        for(int i=0;i<s1.length;i++){
            if(s1[i].length()>0){
                ms1.add(s1[i]);
            }
        }
        String[] s2 = b.s.toLowerCase().split("\\s+");
        for(int i=0;i<s2.length;i++){
            if(s2[i].length()>0){
                ms2.add(s2[i]);
            }
        }
        String res="";
        for(String i: ms1){
            if(ms2.contains(i)){
                res+=i + " ";
            }
        }
        return res;
    }
}
