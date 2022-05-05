import java.util.Scanner;

public class LKToHop2 {
    public static void result(int[] x, int k) {
        for (int i = 1; i <= k; i++) {
            System.out.print(x[i]);
        }
        System.out.print(" ");
    }

    public static void backTrack(int i, int[] x, int n, int k) {
        for (int j = x[i - 1] + 1; j <= n - k + i; j++) {
            x[i] = j;
            if (i == k) {
                result(x, k);
                x[k + 1]++;
            } else {
                backTrack(i + 1, x, n, k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] x = new int[100];
        x[0] = 0;
        x[k + 1] = 0;
        backTrack(1, x, n, k);
        System.out.println();
        System.out.println("Tong cong co " + x[k + 1] + " to hop");
        sc.close();
    }
}
