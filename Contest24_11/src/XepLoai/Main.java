/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XepLoai;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<BangDiem> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(new BangDiem(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        li.sort(Collections.reverseOrder());
        for(BangDiem b: li){
            System.out.println(b);
        }
    }
}
