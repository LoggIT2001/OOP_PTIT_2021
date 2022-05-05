/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05010;

/**
 *
 * @author LONGDT
 */
public class MatHang implements Comparable<MatHang>{
    private String name, group;
    private double mua,ban;
    private int id;

    public MatHang() {
    }

    public MatHang(int id, String name, String group, String mua, String ban) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.mua = Double.parseDouble(mua);
        this.ban = Double.parseDouble(ban);
    }
    
    private double loiNhuan(){
        return this.ban - this.mua;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s %.2f", id, name, group, loiNhuan());
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
