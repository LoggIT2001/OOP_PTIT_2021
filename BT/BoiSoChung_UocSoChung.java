import java.util.Scanner;

public class BoiSoChung_UocSoChung {
    public static long UCLN(long a, long b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else if (b > a) {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            long a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            long GCD = UCLN(a, b);
            long LCM = (a * b) / GCD;
            System.out.print(LCM + " ");
            System.out.println(GCD);
        }
        sc.close();
    }
}
