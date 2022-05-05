/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05056;

import java.text.ParseException;
import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> ds = new ArrayList<>();
        ArrayList<String> tg = new ArrayList<>();
        int i = 1;
        while (t-- >0) {            
            VDV m = new VDV(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            tg.add(m.getTimecple());
            ds.add(m);
            i++;
        }
        Collections.sort(tg);
        Map<String,Integer> kq = new TreeMap<>();
        int xh = 1;
        for (int j = 0; j < tg.size(); j++) {
            if(kq.containsKey(tg.get(j))) {
                xh++;
            }
            else {
                kq.put(tg.get(j), xh);
                xh++;
            }
        }
        for (int j = 0; j < ds.size(); j++) {
            for (Map.Entry<String,Integer> entry : kq.entrySet()) {
                if(ds.get(j).getTimecple().equals(entry.getKey())) {
                    ds.get(j).setXh(entry.getValue());
                }
            }
        }
        Collections.sort(ds);
        for (VDV d : ds) {
            System.out.println(d);
        }
        sc.close();
    }
}
