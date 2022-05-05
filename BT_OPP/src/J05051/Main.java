/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<TienDien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp = "KH0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp = "KH"+String.valueOf(i);
            }
            li.add(new TienDien(tmp, s[0], s[1], s[2]));
        }
        li.sort(Collections.reverseOrder());
        for(TienDien x: li){
            System.out.println(x);
        }
    }
}
