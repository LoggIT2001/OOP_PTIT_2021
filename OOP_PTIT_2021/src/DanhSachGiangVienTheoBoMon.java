import java.util.*;

public class DanhSachGiangVienTheoBoMon {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.valueOf(sc.nextLine());
        List<GiangVien1> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[2];
            for(int x=0;x<2;x++){
                s[x]=sc.nextLine();
            }
            li.add(new GiangVien1(s[0], s[1]));
        }
        int l = Integer.valueOf(sc.nextLine());
        String[] tmp = new String[l];
        for(int i=0;i<l;i++){
            tmp[i]=sc.nextLine();
        }
        for(int i=0;i<l;i++){
            String res="";
            String[] s = tmp[i].toUpperCase().split("\\s+");
            for(int j=0;j<s.length;j++){
                if(s[j].length()>0){
                    char[] c = s[j].toCharArray();
                    res+=c[0];
                }
            }
            int dem=1;
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(GiangVien1 x: li){
                if(x.MMH().contains(res)==true){
                    if(dem>0 && dem<=9){
                        System.out.print("GV0" + dem + " ");
                    }else if(dem>=10 && dem<=99){
                        System.out.print("GV" + dem + " ");
                    }
                    System.out.println(x);
                }
                dem++;
            }
        }
    }
}

class GiangVien1{
    private String name;
    private String Mon;
    
    public GiangVien1(){
        
    }
    public GiangVien1(String name, String Mon){
        this.name = name;
        this.Mon = Mon;
    }
    public String MMH(){
        String res="";
        String[] s = this.Mon.toUpperCase().split("\\s+");
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                res+=c[0];
            }
        }
        return res;
    }
    public String getName(){
        return this.name;
    }
    public String getMon(){
        return this.Mon;
    }
    @Override
    public String toString(){
        return String.format("%s %s", name, MMH());
    }
}