// day ngoac dung dai nhat
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
public class J08021 {
    public static int result(String s){
        char[] c = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int res=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='('){
                st.push(i);
            }else{
                st.pop();
                if(!st.empty()){
                    res=Math.max(res,i-st.peek());
                }else{
                    st.push(i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            System.out.println(result(s));
        }
    }
}
