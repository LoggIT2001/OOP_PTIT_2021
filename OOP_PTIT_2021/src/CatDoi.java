import java.math.BigInteger;
import java.util.*;

public class CatDoi {
    public static boolean kiemTra(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s= sc.nextLine();
            String res="";
            boolean kt = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='9'){
                    res+="0";
                }else if(s.charAt(i)=='8'){
                    res+="0";
                }else if(s.charAt(i)=='0'){
                    res+="0";
                }else if(s.charAt(i)=='1'){
                    res+=1;
                }else{
                    kt=true;
                    break;
                }
            }
            if(kt==true){
                System.out.println("INVALID");
            }else{
                if(kiemTra(res)==true){
                    BigInteger x = new BigInteger(res);
                    System.out.println(x);
                }else{
                    System.out.println("INVALID");
                }
            }
        }
    }
}

