import java.util.Scanner;
import java.util.Vector;

public class UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int x = 1; x <= test; x++) {
            long n = sc.nextLong();
            Vector<Long> vt = new Vector<Long>();
            for (long i = (long) 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    vt.add(i);
                }
            }
            int count = 0;
            for (long i = 0; i < vt.size(); i++) {
                if (vt.get((int) i) % 2 == 0) {
                    count++;
                }
                if ((n / (vt.get((int) i))) != vt.get((int) i) && (n / (vt.get((int) i))) % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
