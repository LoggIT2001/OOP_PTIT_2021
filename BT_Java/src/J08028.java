import java.util.*;
import java.io.*;
public class J08028 {
    public static long solution(long[] a, int n){
        long b[] = new long [100005];
        long c[] = new long [100005];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(0);
        st2.push(n-1);
        b[0] = -1; c[n-1]=n;
        for(int i=1;i<n;i++){
            int ok1 = 0; int ok2=0;
            while(st1.empty()==false){
                if(a[st1.peek()]<a[i]){
                    ok1 = 1;
                    b[i] = st1.peek();
                    break;
                }
                else st1.pop();
            }
            if(ok1==0) b[i]=-1;
            st1.push(i);
            while(st2.empty()==false){
                if(a[st2.peek()]<a[n-i-1]){
                    ok2 = 1;
                    c[n-i-1]  = st2.peek();
                    break;
                }
                else st2.pop();
            }
           if(ok2==0) c[n-i-1] = n;
           st2.push(n-i-1);
        }
        long dientich=0;
        for(int i=0;i<n;i++){
            long dientich1 = (c[i]-b[i]-1)*a[i];
            dientich = Math.max(dientich,dientich1);
        }
        return dientich;
    }
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        long a1[] = new long [100005];
        long a2[] = new long [100005];
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            a1[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            a2[i] = m - a1[i];
        }
        long vang = solution(a1,n);
        long xanh = solution(a2,n);
        System.out.println(Math.max(vang, xanh));
    }
}
