import java.util.Scanner;
import java.lang.Math;

public class TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            long ans = 0;
            for (int i = 0; i < s.length(); i++) {
                ans = (ans * 10 + (int) s.charAt(i) - '0') % 4;
            }
            ans = ans % 4;
            long tmp = 1 + (int) (Math.pow(2, ans)) + (int) (Math.pow(3, ans)) + (int) (Math.pow(4, ans));
            long res = tmp % 5;
            System.out.println(res);
        }
        sc.close();
    }
}