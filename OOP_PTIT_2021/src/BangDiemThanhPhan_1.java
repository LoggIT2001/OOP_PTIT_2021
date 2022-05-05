import java.util.*;

public class BangDiemThanhPhan_1 {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = Integer.valueOf(sc.nextLine());
       List<BDTP> li = new ArrayList<>();
       for(int i=1;i<=n;i++){
           String[] s = new String[6];
           for(int x=0;x<6;x++){
               s[x]=sc.nextLine();
           }
           li.add(new BDTP(s[0], s[1], s[2], s[3], s[4], s[5]));
       }
       li.sort(Collections.reverseOrder());
       int i=1;
       for(BDTP x: li){
           System.out.print(i +" ");
           System.out.println(x);
           i++;
       }
    }
}

class BDTP implements Comparable<BDTP> {
    private String MSV;
    private String name;
    private String lop;
    private float D1;
    private float D2;
    private float D3;
    
    public BDTP(){
        
    }
    public BDTP(String MSV, String name, String lop, String D1, String D2, String D3){
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.D1 = Float.parseFloat(D1);
        this.D2 = Float.parseFloat(D2);
        this.D3 = Float.parseFloat(D3);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.1f %.1f %.1f", MSV, name, lop, D1, D2, D3);
    }

    @Override
    public int compareTo(BDTP sv) {
        String x = this.MSV;
        if(x.compareTo(sv.MSV) <0){
            return 1;
        }else if(x.compareTo(sv.MSV) >0){
            return -1;
        }else{
            return 0;
        }
    }
    
}
