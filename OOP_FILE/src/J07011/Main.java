// thống kê từ khác nhau trong van ban
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07011;

import java.util.*;
import java.io.*;
/**
 *
 * @author LONGDT
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashMap<String ,Integer> s=new HashMap <>();
        ArrayList<Sorting> p=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a[]=sc.nextLine().toLowerCase().split("\\W+");
            for(String i:a){
                if(s.containsKey(i)) s.put(i, s.get(i)+1);
                else s.put(i, 1);
            }
        }
        for(String i:s.keySet()){
              if (!i.equals("")){
                  Sorting q=new Sorting(i,s.get(i));
                   p.add(q);
              }
            
           
        }
        Collections.sort(p);
        for(Sorting i:p){
            System.out.println(i);
        }
    }
}
