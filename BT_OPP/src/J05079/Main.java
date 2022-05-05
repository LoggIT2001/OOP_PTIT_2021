/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079;

import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> ds = new ArrayList<>();
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {            
            LopHoc x = new LopHoc(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            ds.add(x);
        }
        Collections.sort(ds);
        int k = Integer.parseInt(sc.nextLine());
        while (k-- > 0) {            
            String s = sc.nextLine();
            System.out.print("Danh sach nhom lop mon ");
            for (int i = 0; i < ds.size(); i++) {
                if(ds.get(i).checkID(s)) {
                    System.out.println(ds.get(i).getNameclass() + ":");
                    break;
                }
            }
            for (int i = 0; i < ds.size(); i++) {
                if(ds.get(i).checkID(s)) {
                    System.out.println(ds.get(i));
                }
            }
        }
        sc.close();
    }
}
