import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for (int i = 1; i < n; i++) {
                double x = Math.sqrt(i / n);
                double result = x * h;
                System.out.printf("%.6f ", result);
            }
            System.out.println();
        }
        sc.close();
    }
}
