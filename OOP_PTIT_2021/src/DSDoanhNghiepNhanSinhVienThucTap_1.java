import java.util.*;

public class DSDoanhNghiepNhanSinhVienThucTap_1 {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = Integer.valueOf(sc.nextLine());
       List<SVTT> li = new ArrayList<>();
       for(int i=1;i<=n;i++){
           String[] s = new String[3];
           for(int x=0;x<3;x++){
               s[x]=sc.nextLine();
           }
           li.add(new SVTT(s[0], s[1], s[2]));
       }
       li.sort(Collections.reverseOrder());
       for(SVTT x: li){
           System.out.println(x);
       }
    }
}

class SVTT implements Comparable<SVTT> {
    private String MDN;
    private String TDN;
    private int Number;
    
    public SVTT(){
        
    }
    public SVTT(String MDN, String TDN, String N){
        this.MDN=MDN;
        this.TDN=TDN;
        this.Number=Integer.valueOf(N);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", MDN, TDN, Number);
    }

    @Override
    public int compareTo(SVTT sv) {
        if(this.Number > sv.Number){
            return 1;
        }else if(this.Number <sv.Number){
            return -1;
        }else{
            if(this.MDN.compareTo(sv.MDN) <0){
                return 1;
            }else if(this.MDN.compareTo(sv.MDN) >0){
                return -1;
            }else{
                return 0;
            }
        }
    }
    
}