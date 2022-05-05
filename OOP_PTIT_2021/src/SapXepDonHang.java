import java.util.*;

public class SapXepDonHang {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<DonHangSX> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new DonHangSX(s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(DonHangSX x: li){
            System.out.println(x);
        }
    }
}

class DonHangSX implements Comparable<DonHangSX>{
    private String name;
    private String ma;
    private int tien;
    private int sl;
    
    public DonHangSX(){
        
    };
    public DonHangSX(String name, String ma, String tien, String sl){
        this.name = name;
        this.ma = ma;
        this.tien = Integer.parseInt(tien);
        this.sl = Integer.parseInt(sl);
    }
    public String stt(){
        char[] c = this.ma.toCharArray();
        String res="";
        res+=String.valueOf(c[1])+String.valueOf(c[2])+String.valueOf(c[3]);
        return res;
    }
    public int giamgia(){
        char[] c = this.ma.toCharArray();
        int res=0;
        if(c[4]=='1'){
            res = (this.tien*this.sl*50)/100;
        }else if(c[4]=='2'){
            res = (this.tien*this.sl*30)/100;
        }
        return res;
    }
    public int thanhtien(){
        return (this.tien*this.sl - this.giamgia());
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", name, ma, stt(), giamgia(), thanhtien());
    }

    @Override
    public int compareTo(DonHangSX dh) {
        String x = this.stt();
        if(x.compareTo(dh.stt())<0){
            return 1;
        }else if(x.compareTo(dh.stt())>0){
            return -1;
        }else{
            return 0;
        }
    }
}
