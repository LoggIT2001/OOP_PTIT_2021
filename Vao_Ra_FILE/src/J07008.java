// day con tang dan
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
public class J07008 {
    public static int n,k;
    public static int[] a = new int[25];
    public static int[] x = new int[25];
    public static ArrayList<String> li = new ArrayList<>();
    public static void Try(int i){
        for(int j=x[i-1]+1;j<=n-k+i;j++){
            x[i] = j;
            if(i==k){
                result();
            }else{
                Try(i+1);
            }
        }
    }
    public static void result(){
        int ok=1;
        for(int i=1;i<k;i++){
            if(a[x[i]]>a[x[i+1]]){
                ok=0;
                break;
            }
        }
        if(ok==1){
            String kq="";
            for(int i=1;i<=k;i++){
                kq+=Integer.toString(a[x[i]]) + " ";
            }
            li.add(kq);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        k=2;
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        while(k<=n){
            x[0] = 0;
            Try(1);
            k++;
        }
        Collections.sort(li);
        for(String s: li){
            System.out.println(s);
        }
    }
}
