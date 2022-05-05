// Phan tu ben phai dau tien lon hon
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
public class J08022 {
    public static void solution(int n, int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.empty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            solution(n,arr);
            System.out.println();
        }
    }
}
