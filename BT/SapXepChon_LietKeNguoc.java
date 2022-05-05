import java.util.Scanner;
import java.util.Vector;

public class SapXepChon_LietKeNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> vt = new Vector<>();
        int n = sc.nextInt();
        long[] a = new long[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int index = i + 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            if (a[i] > a[index]) {
                long tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
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
        sc.close();
    }
}
