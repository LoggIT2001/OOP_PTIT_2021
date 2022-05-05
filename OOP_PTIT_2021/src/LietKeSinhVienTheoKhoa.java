import java.util.*;

public class LietKeSinhVienTheoKhoa {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<SinhVien6> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new SinhVien6(s[0], s[1], s[2], s[3]));
        }
        int l= Integer.valueOf(sc.nextLine());
        String[] tmp = new String[l];
        for(int i=0;i<l;i++){
            tmp[i]=sc.nextLine();
        }
        for(int i=0;i<l;i++){
            System.out.println("DANH SACH SINH VIEN KHOA " + tmp[i] + ":");
            for(SinhVien6 x: li){
                if(x.Khoa().contains(tmp[i])==true){
                    System.out.println(x);
                }
            }
        }
    }
}

class SinhVien6{
    private String MSV;
    private String name;
    private String lop;
    private String mail;
    
    public SinhVien6(){
        
    }
    public SinhVien6(String MSV, String name, String lop, String mail){
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }
    public String Khoa(){
        char[] c = this.lop.toCharArray();
        String res="20";
        res+=String.valueOf(c[1]) + String.valueOf(c[2]);
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", MSV, name, lop, mail);
    }
    
}