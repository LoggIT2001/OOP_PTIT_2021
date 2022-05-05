import java.util.*;

public class LietKeSinhVienTheoLop {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n=Integer.valueOf(sc.nextLine());
       List<SinhVien5> li = new ArrayList<>();
       for(int i=1;i<=n;i++){
           String[] s = new String[4];
           for(int x=0;x<4;x++){
               s[x]=sc.nextLine();
           }
           li.add(new SinhVien5(s[0], s[1], s[2], s[3]));
       }
       int a=Integer.valueOf(sc.nextLine());
       String[] tmp = new String[a];
       for(int i=0;i<a;i++){
           tmp[i]=sc.nextLine();
       }
       for(int i=0;i<a;i++){
           System.out.println("DANH SACH SINH VIEN LOP " + tmp[i] + ":");
           for(SinhVien5 x: li){
               if(x.getLop().contains(tmp[i])==true){
                   System.out.println(x);
               }
           }
       }
    }
}

class SinhVien5{
    private String MSV;
    private String name;
    private String lop;
    private String mail;
    
    public SinhVien5(){
        
    }
    public SinhVien5(String MSV, String name, String lop, String mail){
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMSV() {
        return MSV;
    }
    public void setMSV(String MSV) {
        this.MSV = MSV;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s", MSV, name, lop, mail);
    }
}