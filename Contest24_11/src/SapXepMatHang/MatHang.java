/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepMatHang;

/**
 *
 * @author LONGDT
 */
public class MatHang implements Comparable<MatHang>{
    private String id,name,nhom;
    private float mua,ban;

    public MatHang(){
    }

    public MatHang(int id, String name, String nhom, String mua, String ban) {
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.nhom = nhom;
        this.mua = Float.parseFloat(mua);
        this.ban = Float.parseFloat(ban);
    }
    
    private float loiNhuan(){
        return this.ban - this.mua;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + nhom + " " + String.format("%.2f", loiNhuan());
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.loiNhuan()>o.loiNhuan()){
            return 1;
        }else if(this.loiNhuan()<o.loiNhuan()){
           return -1;
        }else{
            return 0;
        }
    }
}
