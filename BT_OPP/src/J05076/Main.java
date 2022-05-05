/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05076;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> li1 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li1.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<ThongKe> li2 = new ArrayList<>();
        for(int i=1;i<=m;i++){
            li2.add(new ThongKe(sc.nextLine()));
        }
        for(ThongKe tk: li2){
            for(MatHang mh: li1){
                if(tk.id().equals(mh.getId())){
                    tk.setMh(new MatHang(mh.getId(), mh.getName(), mh.getXl()));
                }
            }
        }
        for(ThongKe tk: li2){
            System.out.println(tk);
        }
    }
}
