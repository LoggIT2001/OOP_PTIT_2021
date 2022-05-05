import java.util.*;

public class DanhSachThucTap_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<DanhSach2> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[5];
            for(int x=0;x<5;x++){
                s[x]=sc.nextLine();
            }
            li.add(new DanhSach2(i, s[0], s[1], s[2], s[3], s[4]));
        }
        li.sort(Collections.reverseOrder());
        int l = Integer.valueOf(sc.nextLine());
        String[] tmp = new String[l];
        for(int i=0;i<l;i++){
            tmp[i]=sc.nextLine();
        }
        for(int i=0;i<l;i++){
            for(DanhSach2 x: li){
                if(x.getDN().contains(tmp[i])==true){
                    System.out.println(x);
                }
            }
        }
    }
}

class DanhSach2 implements Comparable<DanhSach2> {
    private String MSV;
    private String name;
    private String lop;
    private String mail;
    private String DN;
    private int stt;
    
    public DanhSach2(){
        
    }
    public DanhSach2(int stt, String MSV, String name, String lop, String mail, String DN){
        this.stt = stt;
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
        this.DN = DN;
    }
    public String getMSV(){
        return this.MSV;
    }
    public String getName(){
        return this.name;
    }
    public String getLop(){
        return this.lop;
    }
    public String getMail(){
        return this.mail;
    }
    public String getDN(){
        return this.DN;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", stt, MSV, name, lop, mail, DN);
    }

    @Override
    public int compareTo(DanhSach2 ds) {
        String x  = this.MSV;
        if(x.compareTo(ds.MSV) <0){
            return 1;
        }else if(x.compareTo(ds.MSV) >0){
            return -1;
        }else{
            return 0;
        }
    }

    
}