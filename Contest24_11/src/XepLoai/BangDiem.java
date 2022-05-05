/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XepLoai;

/**
 *
 * @author LONGDT
 */
public class BangDiem implements Comparable<BangDiem>{
    private String name,id;
    private int lt,th,thi;

    public BangDiem() {
    }

    public BangDiem(int id, String name, String lt, String th, String thi) {
        this.id = String.format("SV%02d", id);
        this.name = name.trim();
        this.lt = Integer.parseInt(lt);
        this.th = Integer.parseInt(th);
        this.thi = Integer.parseInt(thi);
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
    private float diem(){
        float res = 0;
        res = (float)(((float)this.lt*25/100) + ((float)this.th*35/100) + ((float)this.thi*40/100));
        return res;
    }
    private String xepLoai(){
        String res="";
        if(diem()>=8){
            res="GIOI";
        }else if(diem()>=6.5 && diem()<8){
            res="KHA";
        }else if(diem()>=5 && diem()<6.5){
            res="TRUNG BINH";
        }else if(diem()<5){
            res="KEM";
        }
        return res;
    }

    @Override
    public String toString() {
        return id + " " + ten() + String.format("%.2f",diem()) + " " + xepLoai();
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.diem()>o.diem()){
            return 1;
        }else if(this.diem()<o.diem()){
            return -1;
        }else{
            return 0;
        }
    }
}
