import java.util.*;

public class TinhTienDien {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<TienDien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x] = sc.nextLine();
            }
            String res="";
            if(i>0 && i<=9){
                res="KH0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                res="KH"+String.valueOf(i);
            }
            li.add(new TienDien(res, s[0], s[1], s[2]));
        }
        for(TienDien x: li){
            System.out.println(x);
        }
    }
}

class TienDien{
    private String MKH;
    private String SD;
    private int moi;
    private int cu;
    
    public TienDien(){
        
    }
    public TienDien(String MKH, String SD, String cu, String moi){
        this.MKH = MKH;
        this.SD = SD;
        this.cu = Integer.parseInt(cu);
        this.moi = Integer.parseInt(moi);
    }
    public int heSo(){
        String x = this.SD;
        int t=0;
        if(x.equals("KD")){
            t=3;
        }else if(x.equals("NN")){
            t=5;
        }else if(x.equals("TT")){
            t=4;
        }else if(x.equals("CN")){
            t=2;
        }
        return t;
    }
    public int thanhTien(){
        return (this.moi - this.cu)*this.heSo()*550;
    }
    public int phuTroi(){
        int pt=0;
        if((this.moi - this.cu)<50){
            pt=0;
        }else if((this.moi - this.cu)>=50 && (this.moi - this.cu)<=100){
            pt= (int)(Math.round(thanhTien()*35/100.0));
        }else if((this.moi - this.cu)>100){
            pt=thanhTien();
        }
        return pt;
    }
    public int tongTien(){
        return (phuTroi() + thanhTien());
    }
    @Override
    public String toString(){
        return String.format("%s %d %d %d %d", MKH, heSo(), thanhTien(), phuTroi(), tongTien());
    }
}