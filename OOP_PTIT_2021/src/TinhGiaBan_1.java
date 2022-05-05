import java.util.*;

public class TinhGiaBan_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.valueOf(sc.nextLine());
        List<DonHang1> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp="MH0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp="MH"+String.valueOf(i);
            }
            li.add(new DonHang1(tmp, s[0], s[1], s[2], s[3]));
        }
        for(DonHang1 x: li){
            System.out.println(x);
        }
    }
}

class DonHang1{
    private String MDH;
    private String name;
    private String donVi;
    private int nhap;
    private int sl;
    
    public DonHang1(){
        
    }
    public DonHang1(String MDH, String name, String donVi, String nhap, String sl){
        this.MDH = MDH;
        this.name = name;
        this.donVi = donVi;
        this.nhap = Integer.parseInt(nhap);
        this.sl = Integer.parseInt(sl);
    }
    public int phiVanChuyen(){
        float res=0;
        res=(this.nhap * this.sl)*5/100;
        return Math.round(res);
    }
    public int thanhTien(){
        float res=0;
        res = (this.nhap * this.sl) + this.phiVanChuyen();
        return Math.round(res);
    }
    public int giaBan(){
        float res=0;
        res=this.thanhTien() + this.thanhTien()*2/100;
        return Math.round(res);
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %d", MDH, name, donVi, phiVanChuyen(), thanhTien(), giaBan());
    }
}