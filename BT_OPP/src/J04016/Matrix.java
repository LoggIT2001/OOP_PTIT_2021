/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04016;

import java.util.*;

/**
 *
 * @author LONGDT
 */
public class Matrix {
    private int length;
    private int hight;
    private int[][] a;
    
    public Matrix(){
        this.length=0;
        this.hight=0;
        a = new int[length][hight];
    }
    public Matrix(int x, int y){
        this.length = x;
        this.hight = y;
        a = new int[length][hight];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<this.length;i++){
            for(int j=0;j<this.hight;j++){
                a[i][j]=Integer.parseInt(sc.next());
            }
        }
    }
    public Matrix mul(Matrix b){
        Matrix x = new Matrix(length, b.hight);
        for(int i=0;i<length;i++){
            for(int j=0;j<b.hight;j++){
                x.a[i][j]=0;
                for(int k=0;k<hight;k++){
                    x.a[i][j]+=this.a[i][k]*b.a[k][j];
                }
            }
        }
        return x;
    }
    @Override
    public String toString(){
        String s="";
        for(int i=0;i<length;i++){
            for(int j=0;j<hight;j++){
                s+=String.valueOf(a[i][j] + " ");
            }
            s+="\n";
        }
        return s;
    }
}
