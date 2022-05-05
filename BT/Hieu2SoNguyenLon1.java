import java.util.Scanner;

public class Hieu2SoNguyenLon1 {
    public static void solution(String s1, String s2) {
        int k = 0;
        int[] a = new int[10000];
        int[] b = new int[10000];
        for (int i = 0; i < s1.length() - s2.length(); i++) {
            b[i] = 0;
            a[i] = s1.charAt(i) - '0';
        }
        for (int i = s1.length() - s2.length(); i < s1.length(); i++) {
            b[i] = s2.charAt(k) - '0';
            a[i] = s1.charAt(i) - '0';
            k++;
        }
        int nho = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            b[i] += nho;
            if (a[i] - b[i] >= 0) {
                a[i] = a[i] - b[i];
                nho = 0;
            } else {
                a[i] = 10 + (a[i] - b[i]);
                nho = 1;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            int x = 2;
            if (s1.length() > s2.length()) {
                x = 1;
            }
            if (s1.length() < s2.length()) {
                x = 0;
            }
            if (s1.length() == s2.length()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) > s2.charAt(i)) {
                        x = 1;
                        break;
                    }
                    if (s1.charAt(i) < s2.charAt(i)) {
                        x = 0;
                        break;
                    }
                }
            }
            if (x == 2) {
                System.out.println("0");
            }
            if (x == 1) {
                solution(s1, s2);
            }
            if (x == 0) {
                solution(s2, s1);
            }
        }
        sc.close();
    }
}
