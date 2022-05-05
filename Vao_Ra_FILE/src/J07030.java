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
public class J07030 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean[] prime = new boolean[1000005];
        prime[0]=true; prime[1]=true;
        for(int i=2;i<=1000000;i++){
            if(prime[i]==false){
                for(int j=i*2;j<=1000000;j+=i){
                    prime[j]=true;
                }
            }
        }
        
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>)ob1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>)ob2.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        
        for(int i=0;i<a1.size();i++){
            int tmp = a1.get(i);
            int tmp2 = 1000000-tmp;
            if(tmp>=tmp2){
                continue;
            }
            if(!prime[tmp] && !prime[tmp2] && a2.contains(tmp2)){
                mp.put(tmp,tmp2);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
