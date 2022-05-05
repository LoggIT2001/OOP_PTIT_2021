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
public class J08026_2 {
    public static int solution(int s, int t){
        if(s==t){
            return 0;
        }
        if(s<=0 && t>0){
            return -1;
        }
        if(s>t){
            return s-t;
        }
        if(t%2!=0){
            return 1 + solution(s,t+1);
        }else{
            return 1 + solution(s,t/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=test;i++){
            int s,t;
            s = sc.nextInt();
            t = sc.nextInt();
            System.out.println(solution(s,t));
        }
    }
}
