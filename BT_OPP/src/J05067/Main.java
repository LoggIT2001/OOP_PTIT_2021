/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05067;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<DonHang> li = new ArrayList<>();
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            li.add(new DonHang(s));
        }
        for(DonHang x: li){
            System.out.println(x);
        }
    }
}
