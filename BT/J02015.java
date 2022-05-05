// Cap so co tong bang K

//import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class J02015 {
    // public static int count(long[] a, int n, long k) {
    // // HashMap<Integer, Integer> hm = new HashMap<>();
    // // for (int i = 0; i < n; i++) {
    // // if (!hm.containsKey((int) a[i])) {
    // // hm.put((int) a[i], 0);
    // // }
    // // hm.put((int) a[i], hm.get((int) a[i]) + 1);
    // // }
    // // int dem = 0;
    // // for (int i = 0; i < n; i++) {
    // // if (hm.get((int) (k - a[i])) != null) {
    // // dem += hm.get((int) (k - a[i]));
    // // }
    // // if (k - a[i] == a[i]) {
    // // dem--;
    // // }
    // // }
    // // return dem / 2;
    // // int dem = 0;
    // // for (int i = 0; i < n - 1; i++) {
    // // for (int j = i + 1; j < n; j++) {
    // // if (a[i] + a[j] == k) {
    // // dem++;
    // // }
    // // }
    // // }
    // // return dem;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int test = sc.nextInt();
    // for (int t = 1; t <= test; t++) {
    // int n = sc.nextInt();
    // long k = sc.nextLong();
    // long[] a = new long[(n + 5)];
    // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextInt();
    // }
    // int dem = count(a, n, k);
    // System.out.println(dem);
    // }
    // sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLong();
            }
            Arrays.sort(a);

            long ans = 0;
            for (int j = 0; j < n - 1; j++) {
                long up = upper_bound(a, j + 1, n - 1, k - a[j]);
                long dow = lower_boud(a, j + 1, n - 1, k - a[j]);
                if (dow <= n - 1)
                    ans += up - dow + 1;
            }
            System.out.println(ans);
        }
        sc.close();
    }

    public static long lower_boud(long[] a, int l, int r, long x) {

        long ans = r + 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                ans = m;
                r = m - 1;
            } else if (a[m] >= x) {
                r = m - 1;
            } else
                l = m + 1;
        }
        return ans;
    }

    public static long upper_bound(long[] a, int l, int r, long x) {

        long ans = r + 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                ans = m;
                l = m + 1;

            } else if (a[m] >= x) {
                r = m - 1;
            } else
                l = m + 1;
        }
        return ans;
    }
}
