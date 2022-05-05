// thong ke tu khac nhau trong file nhi phan
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07012;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> A = (ArrayList<String>)ob.readObject();
        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<Sorting> li = new ArrayList<>();
        String str="";
        for(String i: A){
            str+=i+" ";
        }
        String[] s = str.toLowerCase().split("\\W+");
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                if(mp.containsKey(s[i])){
                    mp.put(s[i], mp.get(s[i])+1);
                }else{
                    mp.put(s[i], 1);
                }
            }
        }
        for(String i:mp.keySet()){
            if (!i.equals("")){
                Sorting q=new Sorting(i,mp.get(i));
                li.add(q);
            }
        }
        Collections.sort(li);
        for(Sorting i:li){
            System.out.println(i);
        }
    }
}
