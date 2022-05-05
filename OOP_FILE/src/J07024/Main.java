// hieu cua 2 tap tu
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07024;

import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.txt");
        WordSet s2 = new WordSet("DATA2.txt");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
