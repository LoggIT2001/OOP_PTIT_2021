/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04019;

import java.util.*;
/**
 *
 * @author LONGDT
 */
public class Triangle {
    private double perimeter;
    private Point a,b,c;
    
    public Triangle(){
        
    }
    public Triangle(Point a , Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;        
        double AB = this.a.distance(this.b);
        double BC = this.b.distance(this.c);
        double AC = this.a.distance(this.c);
        this.perimeter = AB + AC + BC;
    }
    public boolean valid(){
        double AB = this.a.distance(this.b);
        double BC = this.b.distance(this.c);
        double AC = this.a.distance(this.c);
        if(AB<=0 || AC<=0 || BC<=0){
            return false;
        }else{
            if(AB+AC<=BC || AB+BC<=AC || AC+BC<=AB){
                return false;
            }else{
                return true;
            }
        }
    }
    public double getPerimeter(){
        return Double.parseDouble(String.format("%.3f", this.perimeter));
    }
}
