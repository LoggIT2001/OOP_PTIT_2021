import java.util.*;

public class SXDanhSachDoiTuongNhanVien {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<NhanVienSX> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[6];
            for(int x=0;x<6;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(0<i && i<=9){
                tmp="0000"+String.valueOf(i);
            }else if(10<=i && i<=99){
                tmp="000"+String.valueOf(i);
            }
            li.add(new NhanVienSX(tmp, s[0], s[1], s[2], s[3], s[4], s[5]));
        }
        li.sort(Collections.reverseOrder());
        for(NhanVienSX x: li){
            System.out.println(x);
        }
    }
}

class NhanVienSX implements Comparable<NhanVienSX> {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;
    private String MNV;
    
    public NhanVienSX(){
        
    }
    public NhanVienSX(String MNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong){
        this.MNV=MNV;
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
        return String.format("%s %s %s %s %s %s %s",MNV , hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong);
    }

    @Override
    public int compareTo(NhanVienSX nv) {
        String[] s1 = (this.ngaySinh.split("/"));
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=Integer.parseInt(s1[i]);
        }
        String[] s2 = (nv.ngaySinh.split("/"));
        int b[]=new int[3];
        for(int i=0;i<3;i++){
            b[i]=Integer.parseInt(s2[i]);
        }
        if(a[2]<b[2]){
            return 1;
        }else if(a[2]>b[2]){
            return -1;
        }else{
            if(a[1]<b[1]){
                return 1;
            }else if(a[1]>b[1]){
                return -1;
            }else{
                if(a[0]<b[0]){
                    return 1;
                }else if(a[0]>b[0]){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}