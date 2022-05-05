/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077;

/**
 *
 * @author LONGDT
 */
public class NhanVien {
    private String id, name;
    private int lcb, nc;
    private PhongBan p;

    public NhanVien() {
    }

    public NhanVien(String id, String name, String lcb, String nc) {
        this.id = id;
        this.name = name;
        this.lcb = Integer.parseInt(lcb);
        this.nc = Integer.parseInt(nc);
    }

    public void setP(PhongBan p) {
        this.p = p;
    }
    
    public String pb(){
        String res="";
        char[] c = this.id.toCharArray();
        res = String.valueOf(c[3]) + String.valueOf(c[4]);
        return res;
    }
    public String luong(){
        int l = 0;
        char[] c = this.id.toCharArray();
        String s = String.valueOf(c[1]) + String.valueOf(c[2]);
        int x = Integer.parseInt(s);
        if(c[0]=='A'){
            if(x>=1 && x<=3){
                l = 10;
            }else if(x>=4 && x<=8){
                l = 12;
            }else if(x>=9 && x<=15){
                l = 14;
            }else if(x>=16){
                l = 20;
            }
        }else if(c[0]=='B'){
            if(x>=1 && x<=3){
                l = 10;
            }else if(x>=4 && x<=8){
                l = 11;
            }else if(x>=9 && x<=15){
                l = 13;
            }else if(x>=16){
                l = 16;
            }
        }else if(c[0]=='C'){
            if(x>=1 && x<=3){
                l = 9;
            }else if(x>=4 && x<=8){
                l = 10;
            }else if(x>=9 && x<=15){
                l = 12;
            }else if(x>=16){
                l = 14;
            }
        }else if(c[0]=='D'){
            if(x>=1 && x<=3){
                l = 8;
            }else if(x>=4 && x<=8){
                l = 9;
            }else if(x>=9 && x<=15){
                l = 11;
            }else if(x>=16){
                l = 13;
            }
        }
        int kq = l * this.nc * this.lcb;
        String res = String.valueOf(kq) + "000";
        return res;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + p.namePB() + this.luong();
    }
}
