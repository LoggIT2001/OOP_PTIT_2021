// danh dau chu so
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> ms = new HashSet<Character>(); 
        for(int i=0;i<s.length();i++){
            ms.add(s.charAt(i));
        }
        System.out.println(ms.size());
    }
}
