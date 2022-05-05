import java.util.*;

public class TraCuuDonHang {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<DonHang> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new DonHang(s[0], s[1], s[2], s[3]));
        }
        for(DonHang x: li){
            System.out.println(x);
        }
    }
}

class DonHang{
    private String name;
    private String ma;
    private long tien;
    private long sl;
    
    public DonHang(){
        
    };
    public DonHang(String name, String ma, String tien, String sl){
        this.name = name;
        this.ma = ma;
        this.tien = Long.parseLong(tien);
        this.sl = Long.parseLong(sl);
    }
    public String stt(){
        char[] c = this.ma.toCharArray();
        String res="";
        res+=String.valueOf(c[1])+String.valueOf(c[2])+String.valueOf(c[3]);
        return res;
    }
    public long giamgia(){
        char[] c = this.ma.toCharArray();
        long res=0;
        if(c[4]=='1'){
            res = (this.tien*this.sl*50)/100;
        }else if(c[4]=='2'){
            res = (this.tien*this.sl*30)/100;
        }
        return res;
    }
    public long thanhtien(){
        return (this.tien*this.sl - this.giamgia());
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", name, ma, stt(), giamgia(), thanhtien());
    }
}