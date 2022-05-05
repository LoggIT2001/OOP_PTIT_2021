/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTienPhong;

import java.io.*;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        li.sort(Collections.reverseOrder());
        for(KhachHang k: li){
            System.out.println(k);
        }
    }
}
