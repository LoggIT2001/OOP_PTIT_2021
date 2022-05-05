/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04020;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Pair <S,T>{
    private S a;
    private T b;
    
    public Pair(){
        
    }
    public Pair(S a, T b){
        this.a= a;
        this.b= b;
    }
    private boolean check(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isPrime(){
        if(check((Integer)a)==true && check((Integer)b)==true){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%d %d", (Integer)a, (Integer)b);
    }
    
}
