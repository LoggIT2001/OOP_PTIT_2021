// Ma tran nhi phan
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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int dem=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int bit0=0,bit1=0;
            for(int j=0;j<3;j++){
                if(a[i][j]==0){
                    bit0++;
                }else if(a[i][j]==1){
                    bit1++;
                }
            }
            if(bit1 > bit0){
                dem++;
            }
        }
        System.out.println(dem);
    }
}
