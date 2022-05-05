import java.util.Scanner;

public class SoDep2 {
    public static boolean reversibleNumber(String s) {
        long length = s.length();
        for (long i = 0; i < length / 2; i++) {
            if (s.charAt((int) i) != s.charAt((int) (length - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution(String s) {
        long length = s.length();
        long sum = 0;
        for (long i = 0; i < length; i++) {
            sum += (s.charAt((int) i) - '0');
        }
        if (s.charAt((int) (length - 1)) == '8') {
            if (sum % 10 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            if (reversibleNumber(s) == true && solution(s) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
