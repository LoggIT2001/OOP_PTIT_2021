/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07034;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> li = new ArrayList<>();
        for(int i=1;i<=t;i++){
            li.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        li.sort(Collections.reverseOrder());
        for(MonHoc mh: li){
            System.out.println(mh);
        }
    }
}
