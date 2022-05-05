/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        List<MatHang> li = new ArrayList<>();
        for(int t=1;t<=test;t++){
            String[] s = new String[4];
            for(int i=0;i<4;i++){
                s[i]=sc.nextLine();
            }
            String ma = "";
            if(t>0 && t<=9){
                ma = "MH00" + String.valueOf(t);
            }else if(t>=10 && t<=99){
                ma = "MH0" + String.valueOf(t);
            }
            li.add(new MatHang(ma, s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(MatHang i: li){
            System.out.println(i);
        }
    }
}
