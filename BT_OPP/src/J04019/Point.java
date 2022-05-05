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
public class Point {
    private double x;
    private double y;
    
    public Point(){
        
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(Point b){
        double hoanh = Math.abs(this.x - b.x);
        double tung = Math.abs(this.y - b.y);
        double res = Math.sqrt(Math.pow(hoanh, 2) + Math.pow(tung, 2));
        return res;
    }
}
