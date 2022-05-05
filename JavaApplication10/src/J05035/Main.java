/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05035;

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
        List<DanhSach2> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[5];
            for(int x=0;x<5;x++){
                s[x]=sc.nextLine();
            }
            li.add(new DanhSach2(i, s[0], s[1], s[2], s[3], s[4]));
        }
        li.sort(Collections.reverseOrder());
        int l = Integer.valueOf(sc.nextLine());
        String[] tmp = new String[l];
        for(int i=0;i<l;i++){
            tmp[i]=sc.nextLine();
        }
        for(int i=0;i<l;i++){
            for(DanhSach2 x: li){
                if(x.getDN().contains(tmp[i])==true){
                    System.out.println(x);
                }
            }
        }
    }
}
