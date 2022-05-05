import java.util.Scanner;
import java.lang.Math;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s1 = sc.next();
            String s2 = sc.next();
            int dem = 0;
            int len = 0;
            int res = 0;
            while (s1.length() < s2.length()) {
                s1 += " ";
            }
            while (s1.length() > s2.length()) {
                s2 += " ";
            }
            if (s1.length() > s2.length()) {
                len = s1.length();
            } else {
                len = s2.length();
            }
            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    dem = 0;
                } else {
                    dem++;
                }
                res = Math.max(res, dem);
            }
            if (res == 0) {
                System.out.println("-1");
            } else {
                System.out.println(res);
            }
        }
        sc.close();
    }
}
