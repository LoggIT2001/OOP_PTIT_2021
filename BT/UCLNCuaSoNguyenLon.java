import java.util.Scanner;

public class UCLNCuaSoNguyenLon {
    public static long GCD(long x, long y) {
        long temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        while (x != 0) {
            temp = x;
            x = y % x;
            y = temp;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            long a = sc.nextLong();
            String b = sc.next();
            long n = b.length();
            long c = 0;
            for (long i = 0; i < n; i++) {
                c = c * 10 + (b.charAt((int) i) - '0');
                c = c % a;
            }
            long res = GCD(a, c);
            System.out.println(res);
        }
        sc.close();
    }
}
