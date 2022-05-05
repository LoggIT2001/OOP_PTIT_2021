/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemTuyenSinh;

/**
 *
 * @author LONGDT
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String name,dt,kv,id;
    private float diemThi;

    public ThiSinh() {
    }

    public ThiSinh(int id, String name,  String diemThi, String dt, String kv) {
        this.id = String.format("TS%02d", id);
        this.name = name.trim();
        this.diemThi = Float.parseFloat(diemThi);
        this.dt = dt;
        this.kv = kv;
    }
    
    private String ten(){
        String[] s = this.name.toLowerCase().split("\\s+");
        String res="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                if(c[0]>='a' && c[0]<='z'){
                    c[0]-=32;
                }
                res+=String.valueOf(c) + " ";
            }
        }
        return res;
    }
    private float tong(){
        float res=0;
        if(dt.equals("Kinh")){
            res+=0;
        }else{
            res+=1.5;
        }
        if(kv.equals("1")){
            res+=1.5;
        }else if(kv.equals("2")){
            res+=1;
        }else if(kv.equals("3")){
            res+=0;
        }
        return res+this.diemThi;
    }
    private String xt(){
        String res="";
        if(tong()>=20.5){
            res="Do";
        }else{
            res="Truot";
        }
        return res;
    }
    @Override
    public String toString(){
        return id + " " + ten() + String.format("%.1f", tong()) + " " + xt();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.tong()>o.tong()){
            return 1;
        }else if(this.tong()<o.tong()){
            return -1;
        }else{
            if(this.id.compareTo(o.id)<0){
                return 1;
            }else if(this.id.compareTo(o.id)>0){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
