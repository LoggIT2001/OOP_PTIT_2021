import java.util.*;

public class TinhTien {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Tien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[5];
            for(int x=0;x<5;x++){
                s[x]=sc.nextLine();
            }
            li.add(new Tien(s[0], s[1], s[2], s[3], s[4]));
        }
        li.sort(Collections.reverseOrder());
        for(Tien x : li){
            System.out.println(x);
        }
    }
}

class Tien implements Comparable<Tien> {
    private String MSP;
    private String name;
    private long sl;
    private long dg;
    private long ck;
    
    public Tien(){
        
    }
    public Tien(String MSP, String name, String sl, String dg, String ck){
        this.MSP=MSP;
        this.name=name;
        this.sl = Long.valueOf(sl);
        this.dg = Long.valueOf(dg);
        this.ck= Long.valueOf(ck);
    }
    public String getMSP(){
        return this.MSP;
    }
    public String getName(){
        return this.name;
    }
    public long getSL(){
        return this.sl;
    }
    public long getDG(){
        return this.dg;
    }
    public long getCK(){
        return this.ck;
    }
    public long TT(){
        return (dg*sl - ck);
    }

    @Override
    public String toString() {
        return MSP + " " + name + " " + sl + " " + dg + " " + ck + " " + TT();
    }

    @Override
    public int compareTo(Tien t) {
        Long x = this.TT();
        return x.compareTo(t.TT());
    }
}
