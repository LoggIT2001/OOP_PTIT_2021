import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TapTuRiengCua2Xau {
    public static void solution(String s1, String s2) {
        String tmp = "";
        String[] x = s1.split("\\s+");
        for (int i = 0; i < x.length; i++) {
            if (s2.contains(x[i]) == false) {
                tmp = tmp.concat(x[i] + " ");
            }
        }
        String[] kt = tmp.split("\\s+");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for (String i : kt) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() != 0) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int t = 1; t <= test; t++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            solution(s1, s2);
        }
        sc.close();
    }
}
