/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07007;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LONGDT
 */
public class WordSet {
    private File file;
    
    public WordSet(){
        
    }
    public WordSet(String s){
        this.file = new File(s);
    }
    private String Word() throws IOException{
        Scanner sc = new Scanner(this.file);
        String s = "";
        Set<String> ms = new TreeSet<>();
        while(sc.hasNext()){
            s+=sc.next() + " " ;
        }
        String tmp = s.toLowerCase();
        String[] x = tmp.split("\\s+");
        for(int i=0;i<x.length;i++){
            if(x[i].length()>0){
                ms.add(x[i]);
            }
        }
        String res="";
        for(String i: ms){
            res+=i + "\n";
        }
        return res;
    }

    @Override
    public String toString() {
        try {
            return Word();
        } catch (IOException ex) {
            Logger.getLogger(WordSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
