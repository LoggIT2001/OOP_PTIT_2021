/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015;

import java.util.Scanner;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for(int i=0;i<3;i++){
            s[i]=sc.nextLine();
        }
        GiaoVien gv = new GiaoVien(s[0], s[1], s[2]);
        System.out.println(gv);
    }
}
