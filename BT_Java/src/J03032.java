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
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            String[] tmp = s.split("\\s+");
            for(int i=0;i<tmp.length;i++){
                StringBuilder sb = new StringBuilder(tmp[i]);
                sb.reverse();
                System.out.print(sb + " ");
            }
            System.out.println();
        }
    }
}
