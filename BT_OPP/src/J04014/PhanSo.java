/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04014;

/**
 *
 * @author LONGDT
 */
public class PhanSo {
    private long a,b;

    public PhanSo() {
    }

    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }
    
    private long GCD(long x, long y){
        if(y==0){
            return x;
        }else{
            return GCD(y, x%y);
        }
    }
    public void rutGon(){
        long gcd = GCD(this.a, this.b);
        this.a = this.a/gcd;
        this.b = this.b/gcd;
    }
    public PhanSo C(PhanSo x){
        PhanSo p = new PhanSo();
        long t = this.a*x.b+x.a*this.b;
        long m = this.b*x.b;
        p.a = t*t;
        p.b = m*m;
        return p;
    }
    public PhanSo D(PhanSo x){
        PhanSo res = new PhanSo();
        PhanSo p = new PhanSo();
        long t = this.a*x.b+x.a*this.b;
        long m = this.b*x.b;
        p.a = t*t;
        p.b = m*m;
        res.a = this.a*x.a*p.a;
        res.b = this.b*x.b*p.b;
        return res;
    }
    @Override
    public String toString(){
        return String.format("%d/%d", this.a, this.b);
    }
}
