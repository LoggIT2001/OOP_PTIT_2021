import java.util.Scanner;
// import java.util.Vector;

public class TongUocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] prime = new boolean[2000005];
        for (int i = 2; i <= Math.sqrt(2000005); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < 2000005; j += i) {
                    prime[j] = true;
                }
            }
        }
        int n = sc.nextInt();
        long res = 0;
        for (int t = 1; t <= n; t++) {
            int value = sc.nextInt();
            if (!prime[value]) {
                res += value;
            } else {
                while (value % 2 == 0) {
                    res += 2;
                    value /= 2;
                }
                for (int i = 3; value != 1; i += 2) {
                    if (!prime[value]) {
                        res += value;
                        break;
                    }
                    while (value % i == 0) {
                        res += i;
                        value /= i;
                    }
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}
