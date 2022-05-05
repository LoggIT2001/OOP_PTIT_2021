/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07035;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc1,sc2,sc3;
       sc1 = new Scanner(new File("SINHVIEN.in"));
       sc2 = new Scanner(new File("MONHOC.in"));
       sc3 = new Scanner(new File("BANGDIEM.in"));
       ArrayList<SinhVien> sv = new ArrayList<>();
       ArrayList<MonHoc> mh = new ArrayList<>();
       ArrayList<BangDiem> bd = new ArrayList<>();
       int m = Integer.parseInt(sc1.nextLine());
       for(int i=1;i<=m;i++){
           SinhVien tmp = new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
           sv.add(tmp);
       }
       int n = Integer.parseInt(sc2.nextLine());
       for(int i=1;i<=n;i++){
           MonHoc tmp = new MonHoc(sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()));
           mh.add(tmp);
       }
       int k = Integer.parseInt(sc3.nextLine());
       for(int i=1;i<=k;i++){
          String s = sc3.nextLine();
          StringTokenizer st = new StringTokenizer(s);
          String word[] = new String [3];
          int d = 0;
          while(st.hasMoreTokens()){
              word[d++] = st.nextToken();
          }
          BangDiem tmp = new BangDiem(word[0],word[1],Double.parseDouble(word[2]));
          bd.add(tmp);
       }
       Collections.sort(bd);
       int q = Integer.parseInt(sc3.nextLine());
       for(int i=1;i<=q;i++){
           String ques = sc3.nextLine();
           for(MonHoc tmp:mh){
               if(tmp.Getmamh().equals(ques)){
                   System.out.println("BANG DIEM MON "+tmp.Getten()+":");
                   for(BangDiem tmp2:bd){
                       if(tmp2.Getmamh().equals(ques)){
                           for(SinhVien tmp3:sv){
                               if(tmp3.Getmsv().equals(tmp2.Getmsv()))
                               {
                                   if(tmp2.diem()>(int)(tmp2.diem())){
                                       System.out.println(tmp3+" "+tmp2.diem());
                                   }
                                   else System.out.println(tmp3+" "+(int)(tmp2.diem()));
                               }
                           }
                       }
                   }
               }
           }
       }
    }
}
