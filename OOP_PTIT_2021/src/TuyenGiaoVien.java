import java.util.*;

public class TuyenGiaoVien {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<GiaoVien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp+="GV0" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp+="GV"+String.valueOf(i);
            }
            li.add(new GiaoVien(tmp, s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(GiaoVien x: li){
            System.out.println(x);
        }
    }
}

class GiaoVien implements Comparable<GiaoVien> {
    private String name;
    private String MaST;
    private float TH;
    private float CM;
    private String MGV;
    
    public GiaoVien(){
        
    }
    public GiaoVien(String MGV, String name, String MaST, String TH, String CM){
        this.MGV = MGV;
        this.name = name;
        this.MaST = MaST;
        this.TH = Float.valueOf(TH);
        this.CM = Float.valueOf(CM);
    }
    public String getName(){
        return this.name;
    }
    public String getMaST(){
        return this.MaST;
    }
    public float getTH(){
        return this.TH;
    }
    public float getCM(){
        return this.CM;
    }
    public String chuyenMon(){
        char[] c = this.MaST.toCharArray();
        String res="";
        if(c[0]=='A'){
            res="TOAN";
        }else if(c[0]=='B'){
            res="LY";
        }else if(c[0]=='C'){
            res="HOA";
        }
        return res;
    }
    public float tongDiem(){
        char[] c = this.MaST.toCharArray();
        float UT=0;
        if(c[1]=='1'){
            UT = (float)2;
        }else if(c[1]=='2'){
            UT = (float)1.5;
        }else if(c[1]=='3'){
            UT = (float)1;
        }else if(c[1]=='4'){
            UT = (float)0;
        }
        float sum=(this.TH *2 + this.CM + UT);
        return sum;
    }
    public String xepLoai(){
        String res="";
        if(this.tongDiem()>=18){
            res="TRUNG TUYEN";
        }else{
            res="LOAI";
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %s", MGV, name, chuyenMon(), tongDiem(), xepLoai());
    }

    @Override
    public int compareTo(GiaoVien gv) {
        float x= this.tongDiem();
        if(x>gv.tongDiem()){
            return 1;
        }else if(x<gv.tongDiem()){
            return -1;
        }else{
            return 0;
        }
    }
}
