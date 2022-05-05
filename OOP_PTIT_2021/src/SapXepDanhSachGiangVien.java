import java.util.*;

public class SapXepDanhSachGiangVien {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<GiangVien> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String res="";
            if(i>0 && i<=9){
                res+="GV0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                res+="GV"+String.valueOf(i);
            }
            String[] s = new String[2];
            for(int x=0;x<2;x++){
                s[x]=sc.nextLine();
            }
            li.add(new GiangVien(res, s[0], s[1]));
        }
        li.sort(Collections.reverseOrder());
        for(GiangVien x: li){
            System.out.println(x);
        }
    }
}

class GiangVien implements Comparable<GiangVien> {
    private String name;
    private String Mon;
    private String MGV;
    
    public GiangVien(){
        
    }
    public GiangVien(String MGV, String name, String Mon){
        this.MGV = MGV;
        this.name = name;
        this.Mon = Mon;
    }
    public String BMon(){
        String res="";
        String[] s = this.Mon.toUpperCase().split("\\s+");
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                res+=String.valueOf(c[0]);
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s", MGV, name, BMon());
    }
    
    @Override
    public int compareTo(GiangVien gv) {
        String[] a = this.name.split("\\s+");
        String[] b = gv.name.split("\\s+");
        int x = a.length-1;
        int y = b.length-1;
        if(a[x].compareTo(b[y]) <0){
            return 1;
        }else if(a[x].compareTo(b[y]) >0){
            return -1;
        }else{
            if(this.MGV.compareTo(gv.MGV) <0){
                return 1;
            }else if(this.MGV.compareTo(gv.MGV) >0){
                return -1;
            }else{
                return 0;
            }
        }
    }
    
}