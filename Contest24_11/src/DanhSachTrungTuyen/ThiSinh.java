/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSachTrungTuyen;

/**
 *
 * @author LONGDT
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String id,name;
    private float t,l,h;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name, String t, String l, String h) {
        this.id = id;
        this.name = name.trim();
        this.t = Float.parseFloat(t);
        this.l = Float.parseFloat(l);
        this.h = Float.parseFloat(h);
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
    private float khuVuc(){
        float res=0;
        char[] c = id.toCharArray();
        String kv = String.valueOf(c[0]) + String.valueOf(c[1]) + String.valueOf(c[2]);
        if(kv.equals("KV1")){
            res += 0.5;
        }else if(kv.equals("KV2")){
            res+=1;
        }else if(kv.equals("KV3")){
            res+=2.5;
        }
        return res;
    }
    public float diem(){
        float res= t*2+l+h+khuVuc();
        return res;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.diem()>o.diem()){
            return 1;
        }else if(this.diem()<o.diem()){
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

    @Override
    public String toString() {
        String res = id + " " + ten();
        if(khuVuc()==(int)(khuVuc())){
            res+=String.format("%d", (int)khuVuc()) + " ";
        }else{
            res+=String.format("%.1f", khuVuc()) + " ";
        }
        if(diem()==(int)(diem())){
            res+=String.format("%d",(int)diem()) + " ";
        }else{
            res+=String.format("%.1f",diem()) + " ";
        }
        return res;
    }
}
