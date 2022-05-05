import java.util.Scanner;

public class LCMCuaNSoNguyenDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            long res = 1;
            int[] a = new int[n + 5];
            for (int i = 1; i <= n; i++) {
                a[i] = 0;
            }
            for (int i = 2; i <= n; i++) {
                int j = 2, l = i;
                int tmp = (int) Math.sqrt(l) + 1;
                while (l != 1 && j < tmp) {
                    int dem = 0;
                    while (l != 1 && l % j == 0) {
                        dem++;
                        l /= j;
                    }
                    if (dem > a[j]) {
                        a[j] = dem;
                    }
                    j++;
                }
                if (1 > a[l]) {
                    a[l] = 1;
                }
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < a[i]; j++) {
                    res *= i;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
