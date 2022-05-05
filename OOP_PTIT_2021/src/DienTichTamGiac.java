import java.util.*;

public class DienTichTamGiac {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            Double[] d = new Double[6];
            for(int x=0;x<6;x++){
                d[x]=sc.nextDouble();
            }
            PointDT p1 = new PointDT(d[0],d[1]);
            PointDT p2 = new PointDT(d[2],d[3]);
            PointDT p3 = new PointDT(d[4],d[5]);
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a<=0 || b<=0 || c<=0){
                System.out.println("INVALID");
            }else{
                if((a+b <=c) || (a+c <=b) || (b+c <=a)){
                    System.out.println("INVALID");
                }else{
                    double dt = (Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(-a+b+c)))/4;
                    System.out.printf("%.2f", dt);
                    System.out.println();
                }
            }
        }
    }
}

class PointDT {
    private double x;
    private double y;
    
    public PointDT(){
        
    }
    public PointDT(double x, double y){
        this.x=x;
        this.y=y;
    }
    public PointDT (PointDT p){
        this.x=p.x;
        this.y=p.y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(PointDT secondPoint){
        double hoanh = Math.abs(this.x - secondPoint.x);
        double tung = Math.abs(this.y - secondPoint.y);
        double res = Math.sqrt(Math.pow(hoanh, 2) + Math.pow(tung, 2));
        return res;
    }
    public double distance(PointDT p1, PointDT p2){
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