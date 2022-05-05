import java.util.Scanner;

public class ChiaHetCho11 {
    public static boolean div11EqualZero(String s) {
        long length = s.length();
        long odd = 0, even = 0;
        for (long i = 0; i < length; i++) {
            if (i % 2 == 0) {
                odd += (long) (s.charAt((int) i) - '0');
            } else {
                even += (long) (s.charAt((int) i) - '0');
            }
        }
        return ((odd - even) % 11 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            if (div11EqualZero(s) == true) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
