import java.util.Scanner;
import java.util.Vector;

public class SapXepDoiChoTrucTiep_LKNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            Vector<String> vt = new Vector<>();
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
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
