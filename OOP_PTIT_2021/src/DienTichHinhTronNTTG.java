import java.util.*;

public class DienTichHinhTronNTTG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            Double[] d = new Double[6];
            for(int x=0;x<6;x++){
                d[x]=sc.nextDouble();
            }
            PointNT p1 = new PointNT(d[0],d[1]);
            PointNT p2 = new PointNT(d[2],d[3]);
            PointNT p3 = new PointNT(d[4],d[5]);
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a<=0 || b<=0 || c<=0){
                System.out.println("INVALID");
            }else{
                if((a+b <=c) || (a+c <=b) || (b+c <=a)){
                    System.out.println("INVALID");
                }else{
                    double S = (Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(-a+b+c)))/4;
                    double R = (a*b*c)/(4*S);
                    double dt = R*R*Math.PI;
                    System.out.printf("%.3f", dt);
                    System.out.println();
                }
            }
        }
    }
}

class PointNT {
    private double x;
    private double y;
    
    public PointNT(){
        
    }
    public PointNT(double x, double y){
        this.x=x;
        this.y=y;
    }
    public PointNT (PointNT p){
        this.x=p.x;
        this.y=p.y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(PointNT secondPoint){
        double hoanh = Math.abs(this.x - secondPoint.x);
        double tung = Math.abs(this.y - secondPoint.y);
        double res = Math.sqrt(Math.pow(hoanh, 2) + Math.pow(tung, 2));
        return res;
    }
    public double distance(PointNT p1, PointNT p2){
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
