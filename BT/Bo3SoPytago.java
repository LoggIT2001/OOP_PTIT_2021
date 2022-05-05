import java.util.Scanner;

public class Bo3SoPytago {
    public static boolean solution(int[] a, int n) {
        int Maximum = 0;
        for (int i = 0; i < n; i++) {
            Maximum = Math.max(Maximum, a[i]);
        }
        int[] hash = new int[(Maximum + 1)];
        for (int i = 0; i < Maximum; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }
        for (int i = 1; i < Maximum + 1; i++) {
            if (hash[i] == 0) {
                continue;
            }
            for (int j = 1; j < Maximum + 1; j++) {
                if ((i == j && hash[i] == 1) || hash[j] == 0) {
                    continue;
                }
                int val = (int) Math.sqrt(i * i + j * j);
                if ((val * val) != (i * i + j * j))
                    continue;
                if (val > Maximum) {
                    continue;
                }
                if (hash[val] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int[] a = new int[(n + 5)];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (solution(a, n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
