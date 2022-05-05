// liet ke va dem
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
public class J08011 {
    public static boolean check(int n){
        String s = "" + n;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> A = new ArrayList<>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(check(n)){
                if(mp.containsKey(n)){
                    mp.put(n, mp.get(n)+1);
                }else{
                    mp.put(n, 1);
                    A.add(n);
                }
            }
        }
        Collections.sort(A, (Integer a, Integer b)->mp.get(b).compareTo(mp.get(a)));
        for(Integer x: A){
            System.out.println(x + " " + mp.get(x));
        }
    }
}
