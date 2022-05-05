import java.util.Scanner;

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        String mau = sc.next();
        HCN hcn = new HCN();
        hcn.setWidth(dai);
        hcn.setHeight(rong);
        hcn.setColor(mau);
        double x = hcn.getWidth();
        double y = hcn.getHeight();
        String z = hcn.getColor();
        double cv = hcn.findPerimeter();
        double dt = hcn.findArea();
        z = z.toLowerCase();
        char[] c = z.toCharArray();
        c[0] = (char) ((int) c[0] - 32);
        String res = String.valueOf(c);
        if (x <= 0 || y <= 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.0f ", cv);
            System.out.printf("%.0f ", dt);
            System.out.println(res);
        }
        sc.close();
    }
}

class HCN {
    private double width;
    private double height;
    private String color;

    public HCN() {

    }

    public HCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        double tmp = this.width * this.height;
        return tmp;
    }

    public double findPerimeter() {
        double tmp = 2 * (this.height + this.width);
        return tmp;
    }
}