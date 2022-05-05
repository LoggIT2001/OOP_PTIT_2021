import java.util.*;

public class SapXepTheoMaSinhVien {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<SinhVienM> li = new ArrayList<>();
        while(sc.hasNext()){
            String[] s = new String[4];
            for(int x=0;x<4;x++){
                s[x]=sc.nextLine();
            }
            li.add(new SinhVienM(s[0], s[1], s[2], s[3]));
        }
        li.sort(Collections.reverseOrder());
        for(SinhVienM x: li){
            System.out.println(x);
        }
    }
}

class SinhVienM implements Comparable<SinhVienM> {
    private String Msv;
    private String name;
    private String lop;
    private String mail;
    
    public SinhVienM(){
        
    }
    public SinhVienM(String Msv, String name, String lop, String mail){
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
    public int compareTo(SinhVienM sv) {
        String x = this.Msv;
        if(x.compareTo(sv.Msv) <0){
            return 1;
        }else if(x.compareTo(sv.Msv) >0){
            return -1;
        }else{
            return 0;
        }
    }
}
