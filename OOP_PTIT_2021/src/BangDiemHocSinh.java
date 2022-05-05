import java.util.*;

public class BangDiemHocSinh {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<HocSinh> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s = sc.nextLine();
            Double[] f = new Double[10];
            for(int x=0;x<10;x++){
                f[x]=sc.nextDouble();
            }
            sc.nextLine();
            String tmp="";
            if(i>0 && i<=9){
                tmp+="HS0" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp+="HS" + String.valueOf(i);
            }
            li.add(new HocSinh(tmp, s, f[0], f[1], f[2], f[3], f[4], f[5], f[6], f[7], f[8], f[9]));
        }
        li.sort(Collections.reverseOrder());
        for(HocSinh x: li){
            System.out.println(x);
        }
    }
}

class HocSinh implements Comparable<HocSinh> {
    private String name;
    private double T;    //toan
    private double TV;   //tieng viet
    private double NN;   //ngoai ngu
    private double VL;   //vat ly
    private double HH;   //hoa hoc
    private double SH;   //sinh hoc
    private double LS;   //lich su
    private double DL;   //dia li
    private double GDCD; //giao duc cong dan
    private double CN;   //cong nghe
    private String MHS;
    
    public HocSinh(){
        
    }
    public HocSinh(String MHS, String name, double T, double TV, double NN, double VL, double HH,
            double SH, double LS, double DL, double GDCD, double CN){
        this.MHS=MHS;
        this.name=name;
        this.T=T;
        this.TV=TV;
        this.NN=NN;
        this.VL=VL;
        this.HH=HH;
        this.SH=SH;
        this.LS=LS;
        this.DL=DL;
        this.GDCD=GDCD;
        this.CN=CN;
    }
    public String getName(){
        return this.name;
    }
    public double getT(){
        return this.T;
    }
    public double getTV(){
        return this.TV;
    }
    public double getNN(){
        return this.NN;
    }
    public double getVL(){
        return this.VL;
    }
    public double getHH(){
        return this.HH;
    }
    public double getSH(){
        return this.SH;
    }
    public double getLS(){
        return this.LS;
    }
    public double getDL(){
        return this.DL;
    }
    public double getGDCD(){
        return this.GDCD;
    }
    public double getCN(){
        return this.CN;
    }
    public double TB(){
        double tb=(this.T*2 + this.TV*2 + this.NN + this.VL + this.HH + this.SH + this.LS + this.DL + this.GDCD + this.CN)/12;
        double res = Math.round(tb*10)/10.0;
        return res;
    }
    public String XL(){
        String res="";
        double tb=this.TB();
        if(tb >=9.0){
            res="XUAT SAC";
        }else if(tb>=8 && tb<9){
            res="GIOI";
        }else if(tb>=7 && tb<8){
            res="KHA";
        }else if(tb>=5 && tb<7){
            res="TB";
        }else{
            res="YEU";
        }
        return res;
    }
    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", MHS, name, TB(), XL());
    }

    @Override
    public int compareTo(HocSinh hs) {
        if(this.TB() > hs.TB()){
            return 1;
        }else if(this.TB()<hs.TB()){
            return -1;
        }else{
            return 0;
        }
    } 
}
