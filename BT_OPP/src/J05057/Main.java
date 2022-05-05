/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05057;

import java.util.ArrayList;
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
        List<ThiSinh> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[5];
            for(int x=0;x<5;x++){
                s[x]=sc.nextLine();
            }
            li.add(new ThiSinh(s[0], s[1], s[2], s[3], s[4]));
        }
        for(ThiSinh x: li){
            System.out.println(x);
        }
    }
}
