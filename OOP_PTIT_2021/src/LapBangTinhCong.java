import java.util.*;

public class LapBangTinhCong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.valueOf(sc.nextLine());
        List<NhanVienBTC> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new NhanVienBTC(s[0], s[1], s[2], s[3]));
        }
        int i=1;
        for(NhanVienBTC x: li){
            if(i>0 && i<=9){
                System.out.print("NV0" + i + " ");
            }else if(i>=10 && i<=99){
                System.out.print("NV" + i + " ");
            }
            System.out.println(x);
            i++;
        }
    }
}

class NhanVienBTC{
    private String name;
    private int LCB;
    private int NC;
    private String CV;
    
    public NhanVienBTC(){
        
    }
    public NhanVienBTC(String name, String LCB, String NC, String CV){
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
        return String.format("%s %d %d %d %d", name, LuongThang(), Thuong(), PhuCap(), ThuNhap());
    }
    
}
