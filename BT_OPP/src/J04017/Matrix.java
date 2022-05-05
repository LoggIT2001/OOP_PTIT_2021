/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04017;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Matrix {
    private int n;
    private int m;
    private int[][] a;
    
    public Matrix(){
        n=0;
        m=0;
        a = new int[n][m];
    }
    public Matrix(int n, int m){
        this.n=n;
        this.m=m;
        a = new int[n][m];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(sc.next());
            }
        }
    }
    public Matrix trans(){
        Matrix x = new Matrix(m,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                x.a[j][i]=this.a[i][j];
            }
        }
        return x;
    }
    public Matrix mul(Matrix b){
        Matrix x = new Matrix(n, b.m);
        for(int i=0;i<n;i++){
            for(int j=0;j<b.m;j++){
                x.a[i][j]=0;
                for(int k=0;k<m;k++){
                    x.a[i][j]+=this.a[i][k]*b.a[k][j];
                }
            }
        }
        return x;
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res+=String.valueOf(a[i][j] + " ");
            }
            res+="\n";
        }
        return res;
    }
}
