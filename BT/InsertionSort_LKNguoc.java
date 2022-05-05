import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class InsertionSort_LKNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> vts = new Vector<>();
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Vector<Integer> vt = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            vt.add(a[i]);
            Collections.sort(vt);
            String s = "";
            s += "Buoc " + i + ": ";
            for (int j = 0; j < vt.size(); j++) {
                s += String.valueOf(vt.get((int) j)) + " ";
            }
            vts.add(s);
        }
        for (int i = vts.size() - 1; i >= 0; i--) {
            System.out.println(vts.get(i));
        }
        sc.close();
    }
}
