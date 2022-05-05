import java.util.*;

public class LuaChonThamLam {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(s==0 && n==1){
            System.out.println("0 0");
        }else if(s==0 && n>1){
            System.out.println("-1 -1");
        }else if(s>9*n){
            System.out.println("-1 -1");
        }else{
            String Maxs="";
            int x=s;
            if(s>=10){
                Maxs = "9" + Maxs;
                s-=9;
            }else{
                Maxs = String.valueOf(s) + Maxs;
                s=0;
            }
            int dem=1;
            while(s>0){
                if(s<10){
                    Maxs+=String.valueOf(s);
                    s=0;
                    dem++;
                }else{
                    Maxs+="9";
                    s-=9;
                    dem++;
                }
            }
            if(dem<n){
                for(int i=1;i<=n-dem;i++){
                    Maxs+="0";
                }
            }
            String Mins="";
            if(x>=10){
                Mins= "9"+Mins;
                x-=9;
            }else{
                if(n==1){
                    Mins = String.valueOf(x) + Mins;
                }else{
                    Mins = String.valueOf(x-1) + Mins;
                    x=1;
                }
            }
            n--;
            while(n>1 && x>1){
                if(x>=10){
                    Mins = "9" + Mins;
                    n--;
                    x-=9;
                }else{
                    Mins = String.valueOf(x-1) + Mins;
                    n--;
                    x=1;
                }
            }
            if(n==1){
                Mins = String.valueOf(x) + Mins;
                n--;
                x=0;
            }else if(n>=2){
                Mins = String.valueOf(x-1) + Mins;
                n--;
            }
            while(n>1){
                Mins = "0" + Mins;
                n--;
            }
            if(n==1){
                Mins = "1" + Mins;
            }
            System.out.println(Mins + " " + Maxs);
        }
    }
}
