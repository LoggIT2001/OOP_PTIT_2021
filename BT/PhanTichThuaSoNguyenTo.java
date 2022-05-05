import java.util.Scanner;
import java.util.Vector;

public class PhanTichThuaSoNguyenTo {
    public static void prime(long n) {
        long m = n;
        Vector<Long> vt = new Vector<Long>();
        while (n % 2 == 0) {
            vt.add((long) 2);
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(m); i++) {
            while (n % i == 0) {
                vt.add((long) i);
                n /= i;
            }
        }
        if (n > 1) {
            vt.add((long) n);
        }
        vt.add((long) 0);
        int dem = 1;
        for (long i = 0; i < vt.size() - 1; i++) {
            if (vt.get((int) i) == vt.get((int) i + 1)) {
                dem++;
            } else {
                System.out.print(vt.get((int) i) + "(" + dem + ") ");
                dem = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            long n = sc.nextLong();
            System.out.print("Test " + i + ": ");
            prime(n);
            System.out.println();
        }
        sc.close();
    }
}
