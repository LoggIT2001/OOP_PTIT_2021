import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Vector<Integer> vt = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            vt.add(a[i]);
            Collections.sort(vt);
            System.out.print("Buoc " + (i) + ": ");
            for (int j = 0; j < vt.size(); j++) {
                System.out.print(vt.get((int) j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
