/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06006;

import java.util.*;
import java.text.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n;
        HashMap<String, KhachHang> hm1 = new HashMap<>();
        n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String str = String.format("KH%03d", i);
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x] = sc.nextLine();
            }
            hm1.put(str, new KhachHang(str, s[0], s[1], s[2], s[3]));
        }
        HashMap<String, MatHang> hm2 = new HashMap<>();
        n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String str = String.format("MH%03d", i);
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x] = sc.nextLine();
            }
            hm2.put(str, new MatHang(str, s[0], s[1], s[2], s[3]));
        }
        List<HoaDon> li = new ArrayList<>();
        n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String str = String.format("HD%03d", i);
            String id1 = sc.next();
            String id2 = sc.next();
            String sl = sc.next();
            li.add(new HoaDon(str, hm1.get(id1), hm2.get(id2), sl));
        }
        li.sort(Collections.reverseOrder());
        for(HoaDon h: li){
            System.out.println(h);
        }
    }
}
