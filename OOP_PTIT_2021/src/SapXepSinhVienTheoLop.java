import java.util.*;

public class SapXepSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<SinhVien4> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new SinhVien4(s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(SinhVien4 x: li){
            System.out.println(x);
        }
    }
}

class SinhVien4 implements Comparable<SinhVien4> {
    private String Msv;
    private String name;
    private String lop;
    private String mail;
    
    public SinhVien4(){
        
    }
    public SinhVien4(String Msv, String name, String lop, String mail){
        this.Msv = Msv;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", Msv, name, lop, mail);
    }

    @Override
    public int compareTo(SinhVien4 sv) {
        String x = this.lop;
        String y = this.Msv;
        if(x.compareTo(sv.lop) <0){
            return 1;
        }else if(x.compareTo(sv.lop) >0){
            return -1;
        }else{
            if(y.compareTo(sv.Msv)<0){
                return 1;
            }else if(y.compareTo(sv.Msv) >0){
                return -1;
            }else{
                return 0;
            }
        }
    }
    
}