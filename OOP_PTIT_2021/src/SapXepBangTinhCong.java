import java.util.*;

public class SapXepBangTinhCong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.valueOf(sc.nextLine());
        List<NhanVienSXBTC> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String res="";
            if(i>0 && i<=9){
                res="NV0" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                res="NV" + String.valueOf(i);
            }
            li.add(new NhanVienSXBTC(res, s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(NhanVienSXBTC x: li){
            System.out.println(x);
        }
    }
}

class NhanVienSXBTC implements Comparable<NhanVienSXBTC> {
    private String name;
    private int LCB;
    private int NC;
    private String CV;
    private String MNV;
    
    public NhanVienSXBTC(){
        
    }
    public NhanVienSXBTC(String MNV,String name, String LCB, String NC, String CV){
        this.MNV = MNV;
        this.name = name;
        this.LCB = Integer.parseInt(LCB);
        this.NC = Integer.parseInt(NC);
        this.CV = CV;
    }
    public int LuongThang(){
        return (this.LCB * this.NC);
    }
    public int Thuong(){
        int T = 0;
        if(this.NC >= 25){
            T=this.LuongThang()*20/100;
        }else if(this.NC>=22 && this.NC<25){
            T=this.LuongThang()*10/100;
        }else{
            T=0;
        }
        return T;
    }
    public int PhuCap(){
        String x = this.CV;
        int T=0;
        if(x.equals("GD")){
            T=250000;
        }else if(x.equals("PGD")){
            T=200000;
        }else if(x.equals("TP")){
            T=180000;
        }else if(x.equals("NV")){
            T=150000;
        }
        return T;
    }
    public int ThuNhap(){
        return (this.LuongThang()+this.PhuCap()+this.Thuong());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", MNV, name, LuongThang(), Thuong(), PhuCap(), ThuNhap());
    }

    @Override
    public int compareTo(NhanVienSXBTC nv) {
       if(this.ThuNhap() > nv.ThuNhap()){
           return 1;
       }else if(this.ThuNhap() < nv.ThuNhap()){
           return -1;
       }else{
           return 0;
       }
    }
    
}
