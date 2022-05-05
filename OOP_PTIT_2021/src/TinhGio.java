import java.util.*;
public class TinhGio {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Time> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new Time(s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(Time x: li){
            System.out.println(x);
        }
    }
}

class Time implements Comparable<Time>{
    private String maNC;
    private String name;
    private long timeIn;
    private long timeOut;
    
    public Time(){
        
    }
    public Time(String maNC, String name, String In, String Out){
        this.maNC=maNC;
        this.name=name;
        String[] vao = In.split(":");
        String[] ra = Out.split(":");
        this.timeIn = Long.valueOf(vao[0])*60 + Long.valueOf(vao[1]);
        this.timeOut = Long.valueOf(ra[0])*60 + Long.valueOf(ra[1]);
    }
    public String getMaNC(){
        return this.maNC;
    }
    public String getName(){
        return this.name;
    }
    public Long getTimeIn(){
        return this.timeIn;
    }
    public Long getTimeOut(){
        return this.timeOut;
    }
    public String TG(){
        long tmp1 = (this.timeOut - timeIn)/60;
        long tmp2 = (this.timeOut - timeIn)%60;
        return tmp1 + " gio " + tmp2 + " phut";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", maNC, name, TG());
    }
 
    @Override
    public int compareTo(Time tg) {
        Long tmp= this.timeOut - this.timeIn;
        return tmp.compareTo(tg.timeOut - tg.timeIn);
    }
}
