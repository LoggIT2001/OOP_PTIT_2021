import java.util.Scanner;

public class XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            long[] F = new long[93];
            F[1] = 1;
            F[2] = 1;
            for (int i = 3; i <= 92; i++) {
                F[i] = F[i - 1] + F[i - 2];
            }
            long n, k;
            n = sc.nextLong();
            k = sc.nextLong();
            while (n > 2) {
                if (k <= F[(int) (n - 2)]) {
                    n -= 2;
                } else {
                    k -= F[(int) (n - 2)];
                    n -= 1;
                }
            }
            if (n == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
        sc.close();
    }
}
