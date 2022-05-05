/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05061;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<NguoiThiTuyen> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String res="";
            if(i>0 && i<=9){
                res="PH0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                res="PH"+String.valueOf(i);
            }
            li.add(new NguoiThiTuyen(res, s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(NguoiThiTuyen x: li){
            System.out.println(x);
        }
    }
}
