/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05068;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<DonHang> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s = sc.nextLine();
            li.add(new DonHang(s));
        }
        li.sort(Collections.reverseOrder());
        for(DonHang x: li){
            System.out.println(x);
        }
    }
}
