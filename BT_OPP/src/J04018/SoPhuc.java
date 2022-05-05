/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04018;

/**
 *
 * @author LONGDT
 */
public class SoPhuc {
    private int a, b;

    public SoPhuc() {
    }

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public String phC(SoPhuc x){
        String res="";
        int so1 = this.a + x.a;
        int phuc1 = this.b + x.b;
        int so2 = this.a * so1 - this.b * phuc1;
        int phuc2 = this.a * phuc1 + this.b * so1;
        if(phuc2<0){
            res = String.valueOf(so2) + " - " + String.valueOf(Math.abs(phuc2)) + "i";
        }else{
            res = String.valueOf(so2) + " + " + String.valueOf(phuc2) + "i";
        }
        return res;
    }
    public String phD(SoPhuc x){
        String res="";
        int so1 = this.a + x.a;
        int phuc1 = this.b + x.b;
        int so2 = so1*so1 - phuc1*phuc1;
        int phuc2 = so1*phuc1 + so1*phuc1;
        if(phuc2<0){
            res = String.valueOf(so2) + " - " + String.valueOf(Math.abs(phuc2)) + "i";
        }else{
            res = String.valueOf(so2) + " + " + String.valueOf(phuc2) + "i";
        }
        return res;
    }
}
