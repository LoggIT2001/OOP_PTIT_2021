/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008;

/**
 *
 * @author LONGDT
 */
public class GioChuan {
    private String s;
    private MonHoc mh;

    public GioChuan() {
    }

    public GioChuan(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }
    
    public String idGV(){
        String[] tmp = this.s.split("\\s+");
        return tmp[0];
    }
    public String idMH(){
        String[] tmp = this.s.split("\\s+");
        String res = "";
        res = tmp[1];
        return res;
    }
    public float time(){
        String[] tmp = this.s.split("\\s+");
        return Float.parseFloat(tmp[2]);
    }
    
    @Override
    public String toString(){
        return mh.tenMH()+ time();
    }
}
