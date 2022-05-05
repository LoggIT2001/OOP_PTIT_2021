import java.util.*;

public class DanhSachDoiTuongSinhVien_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=Integer.valueOf(sc.nextLine());
        List<SinhVien1> res = new ArrayList<>();
        for(int i=1;i<=t;i++){
            String tmp[] = new String[4];
            for(int x=0;x<4;x++){
                tmp[x]=sc.nextLine();
            }
            res.add(new SinhVien1(tmp[0], tmp[1], tmp[2], tmp[3]));
        }
        int i=1;
        for(SinhVien1 x : res){
            String tmp="";
            if(0<i && i<=9){
                tmp+= "00" + String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp+= "0" + String.valueOf(i);
            }
            System.out.print("B20DCCN" + tmp + " ");
            System.out.println(x);
            i++;
        }
    }        
}
class SinhVien1{
     public String hoTen;
     public String lop;
     public String ngaySinh;
     public float GPA;
     
     public SinhVien1(){
         
     }
     public SinhVien1(String hoTen, String lop, String ngaySinh, String gpa){
         this.hoTen=hoTen;
         this.lop=lop;
         this.ngaySinh=ngaySinh;
         this.GPA = Float.valueOf(gpa);
     }
     public String getHoTen(){
         return this.hoTen;
     }
     public String getLop(){
         return this.lop;
     }
     public String getNgaySinh(){
         return this.ngaySinh;
     }
     public float getGPA(){
         return this.GPA;
     }
     public String ns() {
        int x = 0;
        String d = "";
        for (int i = 0; i < ngaySinh.length(); i++) {
            if (ngaySinh.charAt(i) == '/') {
                x = i;
                break;
            } else {
                d += String.valueOf(ngaySinh.charAt(i));
            }
        }
        String m = "";
        int y = 0;
        for (int i = x + 1; i < ngaySinh.length(); i++) {
            if (ngaySinh.charAt(i) == '/') {
                y = i;
                break;
            } else {
                m += String.valueOf(ngaySinh.charAt(i));
            }
        }
        String tmp = "";
        if (d.length() < 2) {
            tmp += "0";
            for (int i = 0; i < d.length(); i++) {
                tmp += String.valueOf(d.charAt(i));
            }
        } else {
            for (int i = 0; i < d.length(); i++) {
                tmp += String.valueOf(d.charAt(i));
            }
        }
        tmp += "/";
        if (m.length() < 2) {
            tmp += "0";
            for (int i = 0; i < m.length(); i++) {
                tmp += String.valueOf(m.charAt(i));
            }
        } else {
            for (int i = 0; i < m.length(); i++) {
                tmp += String.valueOf(m.charAt(i));
            }
        }
        tmp += "/";
        for (int i = y + 1; i < ngaySinh.length(); i++) {
            tmp += String.valueOf(ngaySinh.charAt(i));
        }
        return tmp;
    }
     @Override
     public String toString(){
         return String.format("%s %s %s %.2f", hoTen, lop, ns() , GPA);
     }
}
