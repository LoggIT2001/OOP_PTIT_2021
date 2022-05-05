import java.util.*;

public class SoUuThe {
    public static boolean chan(String s){
        int l = s.length();
        if(l%2!=0){
            return false;
        }
        int csc=0, csl=0;
        for(int i=0;i<l;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0){
                csc++;
            }else{
                csl++;
            }
        }
        if(csc<=csl){
            return false;
        }
        return true;
    }
    public static boolean le(String s){
        int l = s.length();
        if(l%2==0){
            return false;
        }
        int csc=0, csl=0;
        for(int i=0;i<l;i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0){
                csc++;
            }else{
                csl++;
            }
        }
        if(csc>=csl){
            return false;
        }
        return true;
    }
    public static boolean kt(String s){
        char[] c = s.toCharArray();
        if(c[0]=='0'){
            return false;
        }
        String tmp = s.toUpperCase();
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)>='A' && tmp.charAt(i)<='Z'){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s = sc.nextLine();
            if(kt(s)==true){
                if(chan(s)==true || le(s)==true){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
