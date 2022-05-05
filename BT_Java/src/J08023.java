// hinh chu nhat lon nhat
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
public class J08023 {
    public static long solution(long a[], int n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        long max_area = a[0];
        long left[] = new long[100005];
        long right[] = new long[100005];
        for(int i=0;i<n;i++){
            left[i] = -1;
            right[i] = n;
        }
        int i=0;
        while(i<n){
            while(!st.empty() && st.peek()!=-1 && a[i]<a[st.peek()]){
                right[st.peek()] = (int)i;
                st.pop();
            }
            if(i>0 && a[i]==a[i-1]){
                left[i] = left[i-1];
            }else{
                left[i] = st.peek();
            }
            st.push(i);
            i++;
        }
        for(i=0;i<n;i++){
            max_area = Math.max(max_area, a[i]*(right[i]-left[i]-1));
        } 
        return max_area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            int n = Integer.valueOf(sc.next());
            long[] a = new long[100005];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            System.out.println(solution(a,n));
        }
    }
}
