import java.util.Scanner;

public class MangDoiXung {
    public static boolean check(long[] a, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            long[] a = new long[n + 5];
            for (int x = 0; x < n; x++) {
                a[x] = sc.nextLong();
            }
            if (check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
