import java.util.Scanner;

public class Tong2SoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt();
        // for (int t = 1; t <= test; t++) {
        String x1 = sc.next();
        String x2 = sc.next();
        int indx1 = 0, indx2 = 0;
        for (int i = 0; i < x1.length(); i++) {
            if (x1.charAt(i) != '0') {
                indx1 = i;
                break;
            }
        }
        for (int i = 0; i < x2.length(); i++) {
            if (x2.charAt(i) != '0') {
                indx2 = i;
                break;
            }
        }
        String s1 = x1.substring(indx1);
        String s2 = x2.substring(indx2);
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
        // }
        sc.close();
    }
}
