/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07053;

import java.io.*;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<XetTuyen> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(new XetTuyen(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(XetTuyen i: li){
            System.out.println(i);
        }
    }
}
