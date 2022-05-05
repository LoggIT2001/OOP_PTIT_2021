/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author LONGDT
 */
public class GiangVien {
    private String s;
    private MonHoc mh;
    private BangGioChuan bgc;
    private float gio;
    
    public GiangVien(){
    }
    public GiangVien(String s){
        this.s = s;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public void setBgc(BangGioChuan bgc) {
        this.bgc = bgc;
    }
    
    public String id(){
        String[] tmp = s.split("\\s+");
        String res = "";
        res = tmp[0];
        return res;
    }
    public String name(){
        String[] tmp = s.split("\\s+");
        String res = "";
        for(int i=1;i<tmp.length;i++){
            if(tmp[i].length()>0){
                res+=tmp[i] + " ";
            }
        }
        return res;
    }
    public void setGio(float gio){
        this.gio = gio;
    }
    @Override
    public String toString(){
        return name() + String.format("%.2f", gio);
    }
}
