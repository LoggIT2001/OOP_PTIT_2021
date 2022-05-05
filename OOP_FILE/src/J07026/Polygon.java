/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07026;

/**
 *
 * @author LONGDT
 */
public class Polygon {
    private Point[] p;

    public Polygon() {
    }

    public Polygon(Point[] p) {
        this.p = p;
    }
    
    public String getArea(){
        float sum1=0, sum2=0;
        for(int i=0;i<this.p.length-1;i++){
            sum1+=(float)(p[i].getA() * p[i+1].getB());
        }
        sum1+=(float)(p[p.length-1].getA() * p[0].getB());
        for(int i=0;i<this.p.length-1;i++){
            sum2+=(float)(p[i].getB() * p[i+1].getA());
        }
        sum2+=(float)(p[p.length-1].getB() * p[0].getA());
        float sum = 0;
        sum = sum1 - sum2;
        float res=0;
        res = sum/2;
        return String.format("%.3f", res);
    }
}
