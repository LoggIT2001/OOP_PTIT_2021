/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07009;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LONGDT
 */
public class IntSet {
    private int[] a;
    
    public IntSet(){
        this.a = new int[205];
    }
    public IntSet(int[] a){
        this.a = a;
    }
    public IntSet intersection(IntSet b){
        IntSet c = new IntSet();
        Set<Integer> ms1 = new TreeSet<>();
        Set<Integer> ms2 = new TreeSet<>();
        for(int i=0;i<this.a.length;i++){
            ms1.add(this.a[i]);
        }
        for(int i=0;i<b.a.length;i++){
            ms2.add(b.a[i]);
        }
        int i=0;
        for(Integer x: ms1){
            if(ms2.contains(x)){
                c.a[i++] = x;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<this.a.length;i++){
            if(a[i]!=0){
                s+=String.valueOf(this.a[i] + " ");
            }
        }
        return s;
    }
}
