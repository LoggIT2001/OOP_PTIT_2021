import java.util.Scanner;

public class Tong2SoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String str = "";
            if (s1.length() > s2.length()) {
                String tmp = s1;
                s1 = s2;
                s2 = tmp;
            }
            s1 = new StringBuilder(s1).reverse().toString();
            s2 = new StringBuilder(s2).reverse().toString();
            int n1 = s1.length(), n2 = s2.length();
            int car = 0;
            for (int i = 0; i < n1; i++) {
                int sum = ((int) (s1.charAt(i) - '0') + (int) (s2.charAt(i) - '0') + car);
                str += (char) (sum % 10 + '0');
                car = sum / 10;
            }
            for (int i = n1; i < n2; i++) {
                int sum = ((int) (s2.charAt(i) - '0') + car);
                str += (char) (sum % 10 + '0');
                car = sum / 10;
            }
            if (car > 0) {
                str += (char) (car + '0');
            }
            str = new StringBuilder(str).reverse().toString();
            System.out.println(str);
        }
        sc.close();
    }
}
