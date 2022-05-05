import java.util.Scanner;

public class ChuanHoaXauHoTen1_2 {
    public static String solution(String s) {
        String res = "";
        String[] a = s.toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0) {
                char[] c = a[i].toCharArray();
                c[0] = (char) ((int) c[0] - 32);
                if (res.equals("")) {
                    res += "" + String.valueOf(c);
                } else {
                    res += " " + String.valueOf(c);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = "";
            while (s.length() == 0) {
                s = sc.nextLine();
            }
            String res = solution(s);
            System.out.print(res + "\n");
        }
        sc.close();
    }
}
