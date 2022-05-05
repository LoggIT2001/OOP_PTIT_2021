/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07017;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Pair <S,T>{
    private T first;
    private S second;
    public Pair(T first , S second){
        this.first=first;
        this.second=second;
    }
    private boolean checksnt(Integer n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public boolean isPrime(){
        return checksnt((Integer)first)&&checksnt((Integer)second);
    }
    @Override
    public String toString(){
        return first + " " + second;
    }
}
