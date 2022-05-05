import java.util.*;

public class LietKeSinhVienTheoNganh {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<SinhVien7> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new SinhVien7(s[0], s[1], s[2], s[3]));
        }
        int l = Integer.valueOf(sc.nextLine());
        String[] s = new String[l];
        for(int i=0;i<l;i++){
            s[i]=sc.nextLine();
        }
        for(int i=0;i<l;i++){
            String res = s[i].toUpperCase();
            String[] tmp = s[i].toUpperCase().split("\\s+");
            String ck="";
            for(int j=0;j<2;j++){
                if(tmp[j].length()>0){
                    char[] c = tmp[j].toCharArray();
                    ck+=String.valueOf(c[0]);
                }
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + res + ":");
            for(SinhVien7 x: li){
                if(x.Nganh().contains(ck)==true){
                    if(ck=="CN" && ck=="AT"){
                        if(!x.lp().equals("E")){
                            System.out.println(x);
                        }
                    }else{
                        System.out.println(x);
                    }
                }
            }
        }
    }
}

class SinhVien7{
    private String MSV;
    private String name;
    private String lop;
    private String mail;
    
    public SinhVien7(){
        
    }
    public SinhVien7(String MSV, String name, String lop, String mail){
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }
    public String Nganh(){
        char[] c = this.MSV.toCharArray();
        String res="";
        res+=String.valueOf(c[5]) + String.valueOf(c[6]);
        return res;
    }
    public String lp(){
        char[] c = this.lop.toCharArray();
        String res = String.valueOf(c[0]);
        return res;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s", MSV, name, lop, mail);
    }
}
