import java.util.Scanner;

public class RutGonXauKyTu {
    public static boolean kt(StringBuilder bd) {
        if (bd.length() == 0) {
            return true;
        }
        for (int i = 0; i < bd.length() - 1; i++) {
            if (bd.charAt(i) == bd.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder bd = new StringBuilder(s);
        while (kt(bd) == false) {
            for (int i = 0; i < bd.length() - 1; i++) {
                if (bd.charAt(i) == bd.charAt(i + 1)) {
                    bd = bd.deleteCharAt(i);
                    bd = bd.deleteCharAt(i);
                }
            }
        }
        if (bd.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(bd);
        }
        sc.close();
    }
}
