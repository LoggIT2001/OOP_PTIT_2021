import java.util.*;

public class BangKeTienLuong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<TienLuong> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp="NV0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp="NV"+String.valueOf(i);
            }
            li.add(new TienLuong(tmp, s[0], s[1], s[2], s[3]));
        }
        long res=0;
        for(TienLuong x: li){
            res+=x.thucLinh();
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: " + res);
    }
}

class TienLuong{
    private String MNV;
    private String name;
    private int luong;
    private int ngayCong;
    private String chucVu;
    
    public TienLuong(){
        
    }
    public TienLuong(String MNV, String name, String luong, String ngayCong, String chucVu){
        this.MNV = MNV;
        this.name = name;
        this.luong = Integer.parseInt(luong);
        this.ngayCong = Integer.parseInt(ngayCong);
        this.chucVu = chucVu;
    }
    public int luongThang(){
        return (this.luong * this.ngayCong);
    }
    public int thuong(){
        int res=0;
        if(this.ngayCong >=25){
            res= this.luongThang()*20/100;
        }else if(this.ngayCong <25 &&this.ngayCong >=22){
            res= this.luongThang()*10/100;
        }else{
            res=0;
        }
        return res;
    }
    public int phuCap(){
        int res=0;
        if(this.chucVu.equals("GD")){
            res=250000;
        }else if(this.chucVu.equals("PGD")){
            res=200000;
        }else if(this.chucVu.equals("TP")){
            res=180000;
        }else if(this.chucVu.equals("NV")){
            res=150000;
        }else{
            res=0;
        }
        return res;
    }
    public int thucLinh(){
        return (this.luongThang() + this.thuong() + this.phuCap());
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d %d", MNV, name, luongThang(), thuong(), phuCap(), thucLinh());
    }
}