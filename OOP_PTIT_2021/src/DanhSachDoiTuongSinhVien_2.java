import java.util.*;

public class DanhSachDoiTuongSinhVien_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<SinhVien2> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<s.length;x++){
                s[x]=sc.nextLine();
            }
            li.add(new SinhVien2(s[0], s[1], s[2], s[3]));
        }
        int i=1;
        for(SinhVien2 x: li){
            String res="";
            if(0<i && i<=9){
                res+="00" + String.valueOf(i);
            }else if(10<=i && i<=99){
                res+="0" + String.valueOf(i);
            }
            System.out.print("B20DCCN" + res + " ");
            System.out.println(x);
            i++;
        }
    }
}

class SinhVien2{
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float GPA;
    
    public SinhVien2(){
        
    }
    public SinhVien2(String hoTen, String lop, String ngaySinh, String GPA){
        this.hoTen=hoTen;
        this.lop=lop;
        this.ngaySinh=ngaySinh;
        this.GPA = Float.valueOf(GPA);
    }
    public String getLop(){
        return this.lop;
    }
    public float getGPA(){
        return this.GPA;
    }
    public String name(){
        String res="";
        String[] a = this.hoTen.toLowerCase().split("\\s+");
        for(int i=0;i<a.length;i++){
            if(a[i].length() >0){
                char[] c = a[i].toCharArray();
                c[0]=(char)((int)c[0]-32);
                if(res.equals("")){
                    res+="" + String.valueOf(c);
                }else{
                    res+= " " + String.valueOf(c);
                }
            }
        }
        return res;
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
    public String toString() {
        return String.format("%s %s %s %.2f", name(), lop, ns(), GPA);
    }
}
