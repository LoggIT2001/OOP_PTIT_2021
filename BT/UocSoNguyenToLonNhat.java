import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static void prime(long n) {
        long m = n;
        long vt = 0;
        while (n % 2 == 0) {
            vt = 2;
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(m); i++) {
            while (n % i == 0) {
                vt = i;
                n /= i;
            }
        }
        if (n > 1) {
            vt = n;
        }
        System.out.println(vt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            long n = sc.nextLong();
            prime(n);
        }
        sc.close();
    }
}
