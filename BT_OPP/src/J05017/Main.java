/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05017;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<KhachHang> li = new ArrayList<>();
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String[] s = new String[3];
            for(int i=0;i<3;i++){
                s[i]=sc.nextLine();
            }
            String tmp="";
            if(t>0 && t<=9){
                tmp="KH0"+String.valueOf(t);
            }else if(t>=10 && t<=99){
                tmp="KH"+String.valueOf(t);
            }
            li.add(new KhachHang(tmp, s[0], s[1], s[2]));
        }
        li.sort(Collections.reverseOrder());
        for(KhachHang x: li){
            System.out.println(x);
        }
    }
}

/*
test:
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/