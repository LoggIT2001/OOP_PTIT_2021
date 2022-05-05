// bien doi S-T
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class J08026 {
    public static int solution(int s, int t){
        Set<ST> ms = new HashSet<>(1000);
        LinkedList<ST> lit = new LinkedList<ST>();
        ST node = new ST(s,0);
        lit.offer(node);
        ms.add(node);
        while(!lit.isEmpty()){
            ST tmp = lit.poll();
            ms.add(tmp);
            if(tmp.val == t){
                return tmp.stp;
            }  
            int mul = tmp.val *2;
            int sub = tmp.val -1;
            if(mul >0 && mul<1000){
                ST nodeMul = new ST(mul, tmp.stp +1);
                lit.offer(nodeMul);
            }
            if(sub >0 && sub<1000){
                ST nodeSub = new ST(sub, tmp.stp +1);
                lit.offer(nodeSub);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=test;i++){
            int s,t;
            s = sc.nextInt();
            t = sc.nextInt();
            ST st = new ST(s,t);
            System.out.println(solution(s,t));
        }
    }
}

class ST{
    int val;
    int stp;
    public ST(int val, int stp){
        this.val = val;
        this.stp = stp;
    }
}