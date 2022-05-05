import java.util.*;

public class DienThoaiCucGach {
    public static boolean KT(String s){
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test= Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            String s=sc.nextLine();
            String res="";
            String x = s.toUpperCase();
            for(int i=0;i<x.length();i++){
                if(x.charAt(i)=='A' || x.charAt(i)=='B' || x.charAt(i)=='C'){
                    res+="2";
                }else if(x.charAt(i)=='D' || x.charAt(i)=='E' || x.charAt(i)=='F'){
                    res+="3";
                }else if(x.charAt(i)=='G' || x.charAt(i)=='H' || x.charAt(i)=='I'){
                    res+="4";
                }else if(x.charAt(i)=='J' || x.charAt(i)=='K' || x.charAt(i)=='L'){
                    res+="5";
                }else if(x.charAt(i)=='M' || x.charAt(i)=='N' || x.charAt(i)=='O'){
                    res+="6";
                }else if(x.charAt(i)=='P' || x.charAt(i)=='Q' || x.charAt(i)=='R' || x.charAt(i)=='S'){
                    res+="7";
                }else if(x.charAt(i)=='T' || x.charAt(i)=='U' || x.charAt(i)=='V'){
                    res+="8";
                }else if(x.charAt(i)=='W' || x.charAt(i)=='X' || x.charAt(i)=='Y' || x.charAt(i)=='Z'){
                    res+="9";
                }
            }
            if(KT(res)==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
