/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachTrungTuyen;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        li.sort(Collections.reverseOrder());
        int i=1;
        float dc=0;
        for(ThiSinh t: li){
            if(i==m){
                dc+=t.diem();
                break;
            }
            i++;
        }
        System.out.printf("%.1f",dc);
        System.out.println();
        for(ThiSinh t: li){
            System.out.print(t);
            if(t.diem()>=dc){
                System.out.println("TRUNG TUYEN");
            }else{
                System.out.println("TRUOT");
            }
        }
    }
}
