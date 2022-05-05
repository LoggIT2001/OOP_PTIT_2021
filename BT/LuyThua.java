import java.util.Scanner;

public class LuyThua {
    public static Long mod = (long) 1000000007;

    public static Long power(long a, long b) {
        if (b == 0)
            return (long) 1;
        if (b == 1)
            return (long) a % mod;
        else {
            long p = power(a, b / 2);
            p = p % mod;
            if (b % 2 == 0) {
                return (p % mod * p % mod) % mod;
            } else {
                return ((p % mod * p % mod) % mod * a % mod) % mod;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long res = power(a, b);
            System.out.println(res);
        }
        sc.close();
    }
}
