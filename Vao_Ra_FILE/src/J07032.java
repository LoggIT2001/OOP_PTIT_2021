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
public class J07032 {
    public static boolean NT(int n){
        int tmp = n;
        int res = 0;
        while(tmp > 0) {
            res = res*10 + tmp%10;
            tmp /= 10;
        }
        return n == res;
    }
    public static boolean check(int n){
        int dem = 0;
        int tmp = n;
        int kt = 0;
        while(n > 0) {
            dem++;
            if((n%10) % 2 == 0) {
                kt = 1;
            }
            n/=10;
        }
        if(dem%2 != 0 && dem > 1 && kt == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> li1 = (ArrayList<Integer>)ob1.readObject();
        ArrayList<Integer> li2 = (ArrayList<Integer>)ob2.readObject();
        Collections.sort(li1);
        Collections.sort(li2);
        int[] m1 = new int[1000000];
        int[] m2 = new int[1000000];
        for(Integer i: li1){
            if(check(i) && NT(i)){
                m1[i]++;
            }
        }
        for(Integer i: li2){
            if(check(i) && NT(i)){
                m2[i]++;
            }
        }
        int dem=0;
        for(int i=0;i<1000000;i++){
            if(dem==10){
                break;
            }
            if(m1[i] !=0 && m2[i] !=0){
                dem++;
                System.out.println(i + " " + (m1[i]+m2[i]));
            }
        }
    }
}
