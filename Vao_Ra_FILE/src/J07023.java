// nguyen to va thuan nghich
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
public class J07023 {
    public static boolean isTN(int x){
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        for(int i=0;i<c.length/2;i++){
            if(c[i] != c[c.length - i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> A1 = (ArrayList<Integer>)ob1.readObject();
        ArrayList<Integer> A2 = (ArrayList<Integer>)ob2.readObject();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int[] prime = new int[10005];
        prime[0]=1; prime[1]=1;
        for(int i=2;i<=10000;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=10000;j+=i){
                    prime[j]=1;
                }
            }
        }
        for(Integer i: A1){
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            }else{
                map1.put(i, 1);
            }
        }
        for(Integer i: A2){
            if(map2.containsKey(i)){
                map2.put(i, map2.get(i)+1);
            }else{
                map2.put(i, 1);
            }
        }
        Set<Integer> ms = new TreeSet(map1.keySet());
        for(Integer i: ms){
            if(map2.containsKey(i) && prime[i]==0 && isTN(i)){
                System.out.printf("%d %d %d", i, map1.get(i), map2.get(i));
                System.out.println();
            }
        }
    }
}
