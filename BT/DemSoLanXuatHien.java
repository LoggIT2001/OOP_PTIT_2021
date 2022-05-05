import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int Max = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > Max) {
                    Max = a[i];
                }
            }
            int[] b = new int[100005];
            for (int i = 1; i <= Max; i++) {
                b[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                b[a[i]]++;
            }
            System.out.println("Test " + t + ":");
            for (int i = 0; i < n; i++) {
                if (b[a[i]] != 0) {
                    System.out.println(a[i] + " xuat hien " + b[a[i]] + " lan");
                    b[a[i]] = 0;
                }
            }
        }
        sc.close();
    }
}
