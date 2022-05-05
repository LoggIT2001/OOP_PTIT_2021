/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04021;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class IntSet {
    private int a[];
    
    public IntSet(){
        this.a = new int[100];
    }
    public IntSet(int a[]){
        this.a = a;
    }
    public IntSet union(IntSet b){
        IntSet is = new IntSet(); 
        Set<Integer> ms = new TreeSet<>();
        for(int i=0;i<this.a.length;i++){
            ms.add(this.a[i]);
        }
        for(int i=0;i<b.a.length;i++){
            ms.add(b.a[i]);
        }
        int i=0;
        for(Integer x: ms){
            is.a[i]=x;
            i++;
        }
        return is;
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0;i<this.a.length;i++){
           if(this.a[i]!=0){
               res+=String.valueOf(a[i]) + " ";
           }
        }
        return res;
    }
    
}
