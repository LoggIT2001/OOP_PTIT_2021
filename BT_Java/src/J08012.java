//hinh sao
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
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int tem = -1, a, b, c, d;
        boolean check = true;
 
        if(n==1) ;
        else if(n==2) {
            a = sc.nextInt();
            b = sc.nextInt();        
        }
        else {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
    
            if(a==c) tem = a;
            if(a==d) tem = a;
            if(b==c) tem = b;
            if(b==d) tem = b;
            if(tem == -1) check=false;
            
            for(int i=3; i<n; i++) {
                
                a = sc.nextInt();
                b = sc.nextInt();
    
                if(a!=tem && b!=tem) check = false;
            }
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
