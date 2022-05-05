/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07048;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> li = new ArrayList<>();
        for(int i=0;i<t;i++){
            li.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        li.sort(Collections.reverseOrder());
        for(SanPham sp: li){
            System.out.println(sp);
        }
    }
}
