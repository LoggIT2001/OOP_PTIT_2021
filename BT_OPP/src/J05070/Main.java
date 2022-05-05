// cau lac bo bong da 2
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05070;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<CauLacBo> liclb = new ArrayList<>();
        for(int i=1;i<=n;i++){
            liclb.add(new CauLacBo(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.valueOf(sc.nextLine());
        List<TranDau> litd = new ArrayList<>();
        for(int i=1;i<=m;i++){
            litd.add(new TranDau(sc.nextLine()));
        }
        for(TranDau td: litd){
            for(CauLacBo clb: liclb){
                if(td.id().equals(clb.getId())){
                    td.setClb(new CauLacBo(clb.getId(), clb.getName(), String.valueOf(clb.getGia())));
                }
            }
        }
        litd.sort(Collections.reverseOrder());
        for(TranDau td: litd){
            System.out.println(td);
        }
    }
}
