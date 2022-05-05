import java.util.*;

public class TuyenDung {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<TD> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String[] s = new String[3];
            for(int x=0;x<3;x++){
                s[x]=sc.nextLine();
            }
            String tmp="";
            if(i>0 && i<=9){
                tmp="TS0"+String.valueOf(i);
            }else if(i>=10 && i<=99){
                tmp="TS"+String.valueOf(i);
            }
            li.add(new TD(tmp, s[0], s[1], s[2]));
        }
        li.sort(Collections.reverseOrder());
        for(TD x: li){
            System.out.println(x);
        }
    }
}

class TD implements Comparable<TD> {
    private String name;
    private float LT;
    private float TH;
    private String STT;
    
    public TD(){
        
    }
    public TD(String STT, String name, String LT, String TH){
        this.STT=STT;
        this.name=name;
        this.LT=Float.valueOf(LT);
        this.TH=Float.valueOf(TH);
    }
    public String getName(){
        return this.name;
    }
    public float getLT(){
        return this.LT;
    }
    public float getTH(){
        return this.TH;
    }
    public float DTB(){
        float lt=0;
        if(this.LT > 0 && this.LT <=9){
            lt=(float)(this.LT);
        }else if(this.LT >= 11 && this.LT<=99){
            lt = (float) (this.LT * 0.1);
        }else if(this.LT >=100 && this.LT <=999){
            lt = (float) (this.LT * 0.01);
        }
        float th=0;
        if(this.TH>0 && this.TH<=9){
            th=(float)(this.TH);
        }else if(this.TH >= 11 && this.TH<=100){
            th = (float) (this.TH * 0.1);
        }else if(this.TH>=101 && this.TH<=999){
            th = (float) (this.TH * 0.01);
        }
        float res = (lt + th)/2;
        return res;
    }
    public String XL(){
        String res="";
        if(this.DTB()<=5 && this.DTB()>0){
            res="TRUOT";
        }else if(this.DTB()>5 && this.DTB()<8){
            res="CAN NHAC";
        }else if(this.DTB()>=8 && this.DTB()<=9.5){
            res="DAT";
        }else if(this.DTB()>9.5 && this.DTB()<=10){
            res="XUAT SAC";
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", STT, name, DTB(), XL());
    }

    @Override
    public int compareTo(TD td) {
        float x=this.DTB();
        if(x<td.DTB()){
            return -1;
        }else if(x>this.DTB()){
            return 1;
        }else{
            return 0;
        }
    }
}