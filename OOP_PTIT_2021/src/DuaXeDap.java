import java.util.*;

public class DuaXeDap {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<XeDap> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x]=sc.nextLine();
            }
            li.add(new XeDap(s[0], s[1], s[2]));
        }
        li.sort(Collections.reverseOrder());
        for(XeDap x: li){
            System.out.println(x);
        }
    }
}
 class XeDap implements Comparable<XeDap> {
     private String name;
     private String DV;
     private String time;
     
     public XeDap(){
         
     }
     public XeDap(String name, String DV, String time){
         this.name = name;
         this.DV = DV;
         this.time = time;
     }
     
     public String Ma(){
         String res="";
         String[] a = this.DV.split("\\s+");
         for(int i=0;i<a.length;i++){
             if(a[i].length()>0){
                 char[] c = a[i].toCharArray();
                 res+=String.valueOf(c[0]);
             }
         }
         String[] b = this.name.split("\\s+");
         for(int i=0;i<b.length;i++){
             if(b[i].length() >0){
                 char[] c = b[i].toCharArray();
                 res+=String.valueOf(c[0]);
             }
         }
         return res;
     }

     public String VTTB(){
         String res="";
         String[] a = this.time.split(":");
         int x = Integer.parseInt(a[0])*60 + Integer.parseInt(a[1]);
         int tmp= (x-360);
         int vt = (120*60)/tmp;
         res+=String.valueOf(vt)+" Km/h";
         return res;
     }
     
     @Override
     public String toString(){
         return String.format("%s %s %s %s", Ma(), name, DV, VTTB());
     }
     
    @Override
    public int compareTo(XeDap xd) {
        String x = this.VTTB();
        if(x.compareTo(xd.VTTB()) >0){
            return 1;
        }else if(x.compareTo(xd.VTTB()) <0){
            return -1;
        }else{
            return 0;
        }
    }
     
 }