/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05048;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Hang> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[2];
            for(int x=0;x<2;x++){
                s[x]=sc.nextLine();
            }
            li.add(new Hang(s[0], s[1]));
        }
        for(Hang x: li){
            System.out.println(x);
        }
    }
}
