// import java.util.Scanner;

// public class ChuanHoaXauHoTen1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int test = sc.nextInt();
// sc.nextLine();
// for (int t = 1; t <= test; t++) {
// String s = sc.nextLine();
// s = s.toLowerCase();
// char[] str = s.toCharArray();
// for (int i = 0; i < str.length - 1; i++) {
// if ((i == 0 || str[i - 1] == ' ' || str[i - 1] == '\t') && (str[i] != ' ' ||
// str[i] != '\t')) {
// str[i] -= 32;
// }
// }
// String x = "";
// for (int i = 0; i < str.length; i++) {
// if (str[i] != ' ' || str[i] != '\t') {
// x += String.valueOf(str[i]);
// }
// }
// x += "A";
// String tmp = "";
// Vector<String> vt = new Vector<>();
// for (int i = 0; i < x.length(); i++) {
// if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') {
// vt.add(tmp);
// tmp = "";
// tmp += String.valueOf(x.charAt(i));
// } else {
// tmp += String.valueOf(x.charAt(i));
// }
// }
// for (int i = 1; i < vt.size(); i++) {
// System.out.print(vt.get(i) + " ");
// }
// System.out.println();
// }
// sc.close();
// }
// }
