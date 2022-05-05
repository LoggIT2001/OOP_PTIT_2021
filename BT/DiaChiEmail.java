import java.util.ArrayList;
import java.util.Scanner;

public class DiaChiEmail {
    public static ArrayList<String> A = new ArrayList<String>();

    public static void solution(String s) {
        s = " " + s.toLowerCase() + " ";
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                ans += s.charAt(i);
            }
        }
        ans = ans.substring(0, ans.length() - 1);
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                String tmp = "";
                while (s.charAt(i) != ' ') {
                    tmp += s.charAt(i);
                    i++;
                }
                ans = tmp + ans;
                break;
            }
        }
        A.add(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= test; t++) {
            String s = "";
            do {
                s = sc.nextLine();
            } while (s == "");
            solution(s);
        }
        for (int i = 0; i < A.size(); i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (A.get(i).equals(A.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(A.get(i) + "@ptit.edu.vn\n");
            } else {
                System.out.print(A.get(i) + count + "@ptit.edu.vn\n");
            }
        }
        sc.close();
    }
}