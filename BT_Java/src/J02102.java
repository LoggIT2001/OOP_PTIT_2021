// ma tran xoan oc tang dan
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
public class J02102 {
    public static void sortA(int[] b, int n){
        int tmp = b[0];
        for(int i=0;i<n*n-1;i++){
            for(int j=i+1;j<n*n;j++){
                if(b[i]>b[j]){
                    tmp = b[j];
                    b[j]=b[i];
                    b[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[] b = new int[n*n];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[x++]=a[i][j];
            }
        }
        sortA(b,n);
        int[][] c = new int[n][n];
        int row=n,col=n, d=0, p=0;
        while(d<n*n){
            for(int i=p;i<col;i++){
                c[p][i]=b[d++];
            }
            for(int i=p+1;i<row;i++){
                c[i][col-1]=b[d++];
            }
            if(p!=row-1){
                for(int i=col-2;i>=p;i--){
                    c[row-1][i]=b[d++];
                }
            }
            if(p!=col-1){
                for(int i=row-2;i>p;i--){
                    c[i][p]=b[d++];
                }
            }
            p++;row--;col--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
