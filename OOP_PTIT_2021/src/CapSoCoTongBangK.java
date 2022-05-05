import java.util.*;

public class CapSoCoTongBangK {
    public static long upper(long[] a, long value, int left, int right){
        long res=right+1;
        while(left<=right){
            int mid = (left + right)/2;
            if(a[mid]==value){
                res=mid;
                left=mid+1;
            }else if(a[mid]>=value){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
    
    public static long lower(long[] a, long value, int left, int right){
        long res=right+1;
        while(left<=right){
            int mid = (left+right)/2;
            if(a[mid]==value){
                res=mid;
                right = mid-1;
            }else if(a[mid]>=value){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.valueOf(sc.nextLine());
        for(int t=1;t<=test;t++){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            long res=0;
            for(int i=0;i<n-1;i++){
                long tmp1 = upper(a,k-a[i],i+1,n-1);
                long tmp2 = lower(a,k-a[i],i+1,n-1);
                if(tmp2 <= n-1){
                    res += tmp1 - tmp2 + 1;
                }
            }
            System.out.println(res);
        }
    }
}
