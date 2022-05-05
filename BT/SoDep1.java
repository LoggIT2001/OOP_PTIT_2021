import java.util.Scanner;

public class SoDep1 {
    public static boolean reversibleNumber(String s) {
        long length = s.length();
        for (long i = 0; i < length / 2; i++) {
            if (s.charAt((int) i) != s.charAt((int) (length - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean evenNumber(String s) {
        long length = s.length();
        for (long i = 0; i < length; i++) {
            if ((s.charAt((int) i) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            if (reversibleNumber(s) == true && evenNumber(s) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
