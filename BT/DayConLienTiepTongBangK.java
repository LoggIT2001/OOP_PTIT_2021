import java.util.Scanner;

public class DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n;
            long k;
            n = sc.nextInt();
            k = sc.nextLong();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean kt = false;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
                boolean check = false;
                if (sum > k) {
                    int x = 0;
                    while (x <= i) {
                        sum -= a[i];
                        if (sum == k) {
                            kt = true;
                            check = true;
                            break;
                        }
                        x++;
                    }
                    if (check == true) {
                        break;
                    }
                }
            }
            if (kt == false) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
