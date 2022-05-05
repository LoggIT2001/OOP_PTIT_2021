/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepMatHang;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        li.sort(Collections.reverseOrder());
        for(MatHang x: li){
            System.out.println(x);
        }
    }
}
