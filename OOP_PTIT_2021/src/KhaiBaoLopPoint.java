import java.util.*;
public class KhaiBaoLopPoint {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            Double[] a = new Double[4];
            for(int x=0;x<a.length;x++){
                a[x]=sc.nextDouble();
            }
            Point p1 = new Point(a[0],a[1]);
            Point p2 = new Point(a[2],a[3]);
            double res = p1.distance(p2);
            System.out.printf("%.4f", res);
            System.out.println();
        }
    }
}
class Point {
    private double x;
    private double y;
    
    public Point(){
        
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point (Point p){
        this.x=p.x;
        this.y=p.y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(Point secondPoint){
        double hoanh = Math.abs(this.x - secondPoint.x);
        double tung = Math.abs(this.y - secondPoint.y);
        double res = Math.sqrt(Math.pow(hoanh, 2) + Math.pow(tung, 2));
        return res;
    }
    public double distance(Point p1, Point p2){
        double hoanh = Math.abs(p1.x - p2.x);
        double tung = Math.abs(p1.y - p2.y);
        double res = Math.sqrt(Math.pow(hoanh, 2) + Math.pow(tung, 2));
        return res;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
