// thu gon day so
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
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(st.empty()){
                st.add(x);
            }else{
                int top = st.peek();
                if((top+x)%2==0){
                    st.pop();
                }else{
                    st.add(x);
                }
            }
        }
        System.out.println(st.size());       
    }
}
