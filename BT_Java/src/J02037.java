// Day uu the
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J02037 {
    public static boolean chan(String str){
        String[] s = str.split("\\s+");
        if(s.length%2!=0){
            return false;
        }
        int c=0;
        int l=0;
        for(int i=0;i<s.length;i++){
            if(Integer.parseInt(s[i])%2==0){
                c++;
            }else{
                l++;
            }
        }
        if(c<l){
            return false;
        }
        return true;
    }
    public static boolean le(String str){
        String[] s = str.split("\\s+");
        if(s.length%2==0){
            return false;
        }
        int c=0;
        int l=0;
        for(int i=0;i<s.length;i++){
            if(Integer.parseInt(s[i])%2==0){
                c++;
            }else{
                l++;
            }
        }
        if(c>l){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int t=1;t<=test;t++){
            String str = sc.nextLine();
            if(chan(str)==true || le(str)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
