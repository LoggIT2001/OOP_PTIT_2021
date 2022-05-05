import java.util.*;

public class HopCua2DaySo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n= sc.nextInt();
        m= sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] d = new int[1005];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            d[a[i]]++;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            d[b[i]]++;
        }
        for(int i=0;i<1001;i++){
            if(d[i]!=0){
                System.out.print(i + " ");
            }
        }
    }
}
/*
Set<Integer> set = new TreeSet<>();
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    set.add(a[i]);
}
for(int i=0;i<m;i++){
    b[i]=sc.nextInt();
    set.add(b[i]);
}
for(Integer i: set){
    System.out.print(i + " ");
}
*/