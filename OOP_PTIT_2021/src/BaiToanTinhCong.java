import java.util.*;

public class BaiToanTinhCong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[4];
        for(int i=0;i<4;i++){
            s[i]=sc.nextLine();
        }
        NhanVienTC x = new NhanVienTC(s[0], s[1], s[2], s[3]);
        System.out.print("NV01 ");
        System.out.println(x);
    }
}

class NhanVienTC{
    private String name;
    private int LCB;
    private int NC;
    private String CV;
    
    public NhanVienTC(){
        
    }
    public NhanVienTC(String name, String LCB, String NC, String CV){
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
