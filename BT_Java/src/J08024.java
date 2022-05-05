// So 0 va 9
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
public class J08024 {
    public static Vector<String> vt = new Vector<>();
    
    public static void solution(){
        Queue<String> qe = new LinkedList<>();
        qe.add("9");
        for(int i=10000;i>0;i--){
            String s = qe.peek();
            qe.poll();
            vt.add(s);
            String str = s;
            String s1 = s.concat("0");
            String s2 = str.concat("9");
            qe.add(s1);
            qe.add(s2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        solution();
        for(int t=1;t<=test;t++){
            int n = Integer.valueOf(sc.nextLine());
            for(int i=0;i<vt.size();i++){
                if(Integer.parseInt(vt.get((int) i))%n==0){
                    System.out.print(vt.get((int) i));
                    break;
                }
            }
            System.out.println();
        }
    }
}
