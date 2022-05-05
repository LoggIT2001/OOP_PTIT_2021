import java.util.*;

public class TongGiaiThua {
    public static long giaiThua(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res=0;
        for(int i=1;i<=n;i++){
            res+=giaiThua(i);
        }
        System.out.println(res);
    }
}
