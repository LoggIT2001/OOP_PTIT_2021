import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            long n;
            n = sc.nextLong();
            long sum = n * (1 + n) / 2;
            System.out.println(sum);
        }
        sc.close();
    }
}
