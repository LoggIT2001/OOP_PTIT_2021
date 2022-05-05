/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04011;

/**
 *
 * @author LONGDT
 */
public class Point3D {
    private int x;
    private int y;
    private int z;
    
    public Point3D(){
        
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        int a1 = b.x - a.x;
        int b1 = b.y - a.y;
        int c1 = b.z - a.z;
        int a2 = c.x - a.x;
        int b2 = c.y - a.y;
        int c2 = c.z - a.z;
        
        int x1 = b1*c2 - b2*c1;
        int x2 = a2*c1 - a1*c2;
        int x3 = a1*b2 - b1*a2;
        int x4 = (-x1*a.x - x2*a.y - x3*a.z);
        if((x1*d.x + x2*d.y + x3*d.z + x4) ==0){
            return true;
        }else{
            return false;
        }
    }
}
