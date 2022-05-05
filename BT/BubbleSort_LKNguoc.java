import java.util.Scanner;
import java.util.Vector;

public class BubbleSort_LKNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            Vector<String> vt = new Vector<>();
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            int[] b = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (b[i] > b[j]) {
                        int tmp = b[i];
                        b[i] = b[j];
                        b[j] = tmp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                boolean ok = true;
                for (int j = 0; j < n; j++) {
                    if (a[j] != b[j]) {
                        ok = false;
                        break;
                    }
                }
                if (ok)
                    break;
                for (int j = 0; j < n - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                    }
                }
                String s = "";
                s += "Buoc " + (i + 1) + ": ";
                for (int j = 0; j < n; j++) {
                    s += String.valueOf(a[j]) + " ";
                }
                vt.add(s);
            }
            for (int i = vt.size() - 1; i >= 0; i--) {
                System.out.println(vt.get(i));
            }
        }
        sc.close();
    }
}
