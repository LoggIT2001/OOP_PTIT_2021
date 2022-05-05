/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05043;

import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<NhanVien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp = "NV0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp = "NV"+String.valueOf(i);
            }
            li.add(new NhanVien(tmp, s[0], s[1], s[2], s[3]));
        }
        for(NhanVien x: li){
            System.out.println(x);
        }
    }
}
