import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class LoaiBo100 {
    public static int solution(String s) {
        ArrayList<Pair> A = new ArrayList<>();
        A.add(new Pair('@', -1));
        int Max = 0;
        for (int i = 0; i < s.length(); ++i) {
            A.add(new Pair(s.charAt(i), i));
            while (A.size() >= 3 && A.get(A.size() - 3).first == '1' && A.get(A.size() - 2).first == '0'
                    && A.get(A.size() - 1).first == '0') {
                A.remove(A.size() - 3);
                A.remove(A.size() - 2);
                A.remove(A.size() - 1);
            }
            int tmp = A.get(A.size() - 1).second;
            Max = Math.max(Max, i - tmp);
        }
        return Max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 1; t <= test; t++) {
            String s = sc.next();
            int res = solution(s);
            System.out.println(res);
        }
        sc.close();
    }
}

class Pair {
    public char first;
    public int second;

    public Pair() {

    }

    public Pair(char first, int second) {
        this.first = first;
        this.second = second;
    }
}