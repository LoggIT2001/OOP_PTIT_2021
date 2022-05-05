/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05036;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<HangHoa> hh=new ArrayList<>();
        int n;
        n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            HangHoa tmp=new HangHoa(i,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            hh.add(tmp);
        }
        for(HangHoa tmp: hh)
            System.out.println(tmp);
    }
}
