import java.util.Scanner;

public class XauDoiXung {
    public static boolean reversibleNumber(String s) {
        long length = s.length();
        for (long i = 0; i < length / 2; i++) {
            if (s.charAt((int) i) != s.charAt((int) (length - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static long solution(String s) {
        long length = s.length();
        long dem = 0;
        for (long i = 0; i < length / 2; i++) {
            if (s.charAt((int) i) != s.charAt((int) (length - i - 1))) {
                dem++;
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            long res = solution(s);
            if (s.length() % 2 == 0) {
                if (res != 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                if (res > 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
