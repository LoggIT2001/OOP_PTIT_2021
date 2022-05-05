/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07046;

import java.io.*;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
 
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> list = new ArrayList<>();
 
        for(int i=1; i<=n; ++i){
            list.add(new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
 
        Collections.sort(list);
 
        for(Khach k: list){
            System.out.println(k);
        }
 
        sc.close();
    }
}

