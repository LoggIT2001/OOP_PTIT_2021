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
public class J07029 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("DATA.txt"));
        ArrayList<Integer> li = (ArrayList<Integer>)ob.readObject();
        int[] prime = new int[10001];
        prime[0]=1; prime[1]=1;
        for(int i=2;i*i<=10000;i++){
            if(prime[i]==0){
                for(int j=i*2;j<=10000;j+=i){
                    prime[j]=1;
                }
            }
        }
        int[] a = new int[1000001];
        for(Integer i: li){
            if(prime[i]==0){
                a[i]++;
            }
        }
        int dem=0;
        for(int i=1000000;i>=0;i--){
            if(dem>=10){
                break;
            }
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
                dem++;
            }
        }
    }
}
