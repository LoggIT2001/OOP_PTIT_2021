// Hinh vuong
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
public class J01025 {
    public static int hoanh(int a, int b, int c, int d){
        int Max=0;
        int Min=0;
        Max = Math.max(a, Math.max(b, Math.max(c, d)));
        Min = Math.min(a, Math.min(b, Math.min(c, d)));
        return (Max - Min);
    }
    public static int tung(int a, int b, int c, int d){
        int Max=0;
        int Min=0;
        Max = Math.max(a, Math.max(b, Math.max(c, d)));
        Min = Math.min(a, Math.min(b, Math.min(c, d)));
        return (Max - Min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int length = hoanh(x1, x2, x3, x4);
        int heigh = tung(y1, y2, y3, y4);
        if(length>heigh){
            System.out.println(length*length);
        }else{
            System.out.println(heigh*heigh);
        }
    }
}
