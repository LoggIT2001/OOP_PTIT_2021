import java.util.*;

public class GiaoCua2DaySo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> ms1 = new TreeSet<>();
        Set<Integer> ms2 = new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            ms1.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            ms2.add(b[i]);
        }
        for(Integer x: ms2){
            if(ms1.contains(x)){
                System.out.print(x + " ");
            }
        }              
    }
}
/*
5 6
1 2 3 4 5
3 4 5 6 7 8
*/