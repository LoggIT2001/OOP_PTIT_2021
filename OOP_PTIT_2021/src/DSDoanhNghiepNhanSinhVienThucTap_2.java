import java.util.*;

public class DSDoanhNghiepNhanSinhVienThucTap_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<DoanhNghiep> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x]=sc.nextLine();
            }
            li.add(new DoanhNghiep(s[0], s[1], s[2]));
        }
        li.sort(Collections.reverseOrder());
        int l = Integer.valueOf(sc.nextLine());
        int[] a = new int[l];
        int[] b = new int[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            if(a[i]<b[i]){
                System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a[i] + " DEN " + b[i] + " SINH VIEN:");
                for(DoanhNghiep x: li){
                    if(a[i]<=x.getSVN() && x.getSVN()<=b[i]){
                        System.out.println(x);
                    }
                }
            }else{
                System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + b[i] + " DEN " + a[i] + " SINH VIEN:");
                for(DoanhNghiep x: li){
                    if(b[i]<=x.getSVN() && x.getSVN()<=a[i]){
                        System.out.println(x);
                    }
                }
            }
        }
        
    }
}

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String MDN;
    private String TDN;
    private int SVN;
    
    public DoanhNghiep(){
        
    }
    public DoanhNghiep(String MDN, String TDN, String SVN){
        this.MDN = MDN;
        this.TDN = TDN;
        this.SVN = Integer.parseInt(SVN);
    }
    
    public String getMDN(){
        return this.MDN;
    }
    public String getTDN(){
        return this.TDN;
    }
    public int getSVN(){
        return this.SVN;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d", MDN, TDN, SVN);
    }

    @Override
    public int compareTo(DoanhNghiep dn) {
        int x = this.SVN;
        String y = this.MDN;
        if(x > dn.SVN){
            return 1;
        }else if(x < dn.SVN){
            return -1;
        }else{
            if(y.compareTo(dn.MDN)<0){
                return 1;
            }else if(y.compareTo(MDN) >0){
                return -1;
            }else{
                return 0;
            }
        }
    }
}