/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05053;

import java.io.*;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Donhang> dh = new ArrayList<>();
        for(int i=1;i<=n;i++){           
            Donhang tmp = new Donhang(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            dh.add(tmp);
        }
        Collections.sort(dh);
        for(Donhang tmp:dh)
            System.out.println(tmp);
    }
}
