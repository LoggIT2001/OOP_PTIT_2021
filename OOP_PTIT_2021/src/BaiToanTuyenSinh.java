import java.util.*;

public class BaiToanTuyenSinh {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s= new String[5];
        for(int i=0;i<5;i++){
            s[i]=sc.nextLine();
        }
        TuyenSinh x = new TuyenSinh(s[0], s[1], s[2], s[3], s[4]);
        System.out.println(x);
    }
}

class TuyenSinh{
    private String ma;
    private String name;
    private float toan;
    private float ly;
    private float hoa;
    
    public TuyenSinh(){
        
    }
    public TuyenSinh(String ma, String name, String toan, String ly, String hoa){
        this.ma = ma;
        this.name = name;
        this.toan = Float.parseFloat(toan);
        this.ly = Float.parseFloat(ly);
        this.hoa = Float.parseFloat(hoa);
    }
    
    public float uuTien(){
        float x=0;
        char[] c = this.ma.toCharArray();
        String res= String.valueOf(c[0]) + String.valueOf(c[1]) + String.valueOf(c[2]);
        if(res.equals("KV1")){
            x=(float)0.5;
        }else if(res.equals("KV2")){
            x=1;
        }else if(res.equals("KV3")){
            x=(float)2.5;
        }
        return x;
    }
    public float tongDiem(){
        float res=0;
        res= toan*2 + ly + hoa;
        return res;
    }
    public String TT(){
        String res="";
        float x = this.tongDiem() + this.uuTien();
        if(x>=24){
            res="TRUNG TUYEN";
        }else{
            res="TRUOT";
        }
        return res;
    }
    @Override
    public String toString(){
        if(uuTien()==(int)(uuTien())){
            if(tongDiem()==(int)tongDiem()){
                return String.format("%s %s %d %d %s", ma, name, (int)uuTien(), (int)tongDiem(), TT());
            }else{
                return String.format("%s %s %d %.1f %s", ma, name, (int)uuTien(), tongDiem(), TT());
            }
        }else{
            if(tongDiem()==(int)tongDiem()){
                return String.format("%s %s %.1f %d %s", ma, name, uuTien(), (int)tongDiem(), TT());
            }else{
                return String.format("%s %s %.1f %.1f %s", ma, name, uuTien(), tongDiem(), TT());
            }
        }
    }
}