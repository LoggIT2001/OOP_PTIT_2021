import java.util.*;

public class DanhSachDoiTuongNhanVien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=Integer.valueOf(sc.nextLine());
        List<NhanVien> li = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String[] s = new String[6];
            for(int x=0;x<6;x++){
                s[x]=sc.nextLine();
            }
            li.add(new NhanVien(s[0], s[1], s[2], s[3], s[4], s[5]));
        }
        int i=1;
        for(NhanVien x: li){
            String tmp="";
            if(0<i && i<=9){
                tmp+= "0000" + String.valueOf(i);
            }else if(10<=i && i<=99){
                tmp+= "000" + String.valueOf(i);
            }
            System.out.print(tmp + " ");
            System.out.println(x);
            i++;
        }
    }
}

class NhanVien  {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;
    
    public NhanVien(){
        
    }
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong){
        this.hoTen=hoTen;
        this.gioiTinh=gioiTinh;
        this.ngaySinh=ngaySinh;
        this.diaChi=diaChi;
        this.maSoThue=maSoThue;
        this.ngayKiHopDong=ngayKiHopDong;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    public String getNgaySinh() {
        return this.ngaySinh;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    public String getMaSoThue() {
        return this.maSoThue;
    }
    public String getNgayKiHopDong() {
        return this.ngayKiHopDong;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
    }

//    @Override
//    public int compareTo(NhanVien nv) {
//        String x=this.hoTen;
//        return x.compareTo();
//    }
}
