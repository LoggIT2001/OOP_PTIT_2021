//kiem tra day ngoac dung
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
public class J08020 {
    public static boolean result(String s){
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        char ch;
        for(int i=0;i<c.length;i++){
            if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
                st.push(c[i]);
                continue;
            }
            if(st.empty()){
                return false;
            }
            switch (c[i]){
                case ')' : {
                    ch = st.peek();
                    st.pop();
                    if(ch=='[' || ch=='{'){
                        return false;
                    }
                    break;
                }
                case ']' : {
                    ch = st.peek();
                    st.pop();
                    if(ch=='(' || ch=='{'){
                        return false;
                    }
                    break; 
                }
                case '}' : {
                    ch = st.peek();
                    st.pop();
                    if(ch=='[' || ch=='('){
                        return false;
                    }
                    break;
                }
            }
        }
        return (st.empty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            if(result(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
