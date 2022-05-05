import java.util.Scanner;

public class TichMaTranVoiMaTranCVCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            long n, m;
            n = sc.nextLong();
            m = sc.nextLong();
            long x = m;
            long y = n;
            long k = m;
            long[][] a = new long[(int) (n + 5)][(int) (m + 5)];
            long[][] b = new long[(int) (x + 5)][(int) (y + 5)];
            long[][] Mul = new long[(int) (n + 5)][(int) (y + 5)];
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < y; j++) {
                    Mul[(int) i][(int) j] = 0;
                }
            }
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < m; j++) {
                    a[(int) i][(int) j] = sc.nextInt();
                    b[(int) j][(int) i] = a[(int) i][(int) j];
                }
            }
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < n; j++) {
                    long sum = 0;
                    for (long l = 0; l < k; l++) {
                        sum += a[(int) i][(int) l] * b[(int) l][(int) j];
                    }
                    Mul[(int) i][(int) j] = sum;
                }
            }
            System.out.println("Test " + t + ": ");
            for (long i = 0; i < n; i++) {
                for (long j = 0; j < y; j++) {
                    System.out.print(Mul[(int) i][(int) j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
