/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05069;

/**
 *
 * @author LONGDT
 */
public class TranDau {
    private String s;
    private CauLacBo clb;

    public TranDau() {
    }

    public TranDau(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setClb(CauLacBo clb) {
        this.clb = clb;
    }
    
    public String idTD(){
        String[] tmp = s.split("\\s+");
        return tmp[0];
    }
    public String id(){
        String[] tmp = s.split("\\s+");
        char[] c = tmp[0].toCharArray();
        String res="";
        res+=String.valueOf(c[1]) + String.valueOf(c[2]);
        return res;
    }
    public int num(){
        String[] tmp = s.split("\\s+");
        return Integer.parseInt(tmp[1]);
    }
    public int doanhThu(){
        return num()*clb.getGia();
    }
    
    @Override
    public String toString(){
        return idTD() + " " + clb.getName() + " " + String.format("%d", doanhThu());
    }
}
