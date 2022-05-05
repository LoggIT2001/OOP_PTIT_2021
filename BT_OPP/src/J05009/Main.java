/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05009;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> listTS = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++) {
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            listTS.add(ts);
        }
        double tmp = listTS.get(0).getTongDiem();
        for(int i = 1; i < listTS.size(); i++) {
            if(tmp < listTS.get(i).getTongDiem()) {
                tmp = listTS.get(i).getTongDiem();
            }
        }
        for(ThiSinh x : listTS) {
            if(x.getTongDiem() == tmp) {
                System.out.println(x);
            }
        }
    }
}
