import java.util.Scanner;

public class KiemTraSoFibonacci {
    public static boolean isFibonacci(long n) {
        long a = 0, b = 1;
        long c = a + b;
        if (n == a || n == b)
            return true;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            long n = sc.nextLong();
            if (isFibonacci(n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
