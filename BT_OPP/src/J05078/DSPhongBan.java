/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05078;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class DSPhongBan {
    ArrayList<PhongBan> listPB = new ArrayList<>();
    
    public void input(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            PhongBan pb = new PhongBan(sc.next(), sc.nextLine());
            
            listPB.add(pb);
        }
    }
    
    public String searchName(String maPB) {
        for(PhongBan pb : listPB) {
            if(pb.getMaPhong().equalsIgnoreCase(maPB)) {
                return pb.getTenPhong();
            }
        }
        return null;
    }
}
