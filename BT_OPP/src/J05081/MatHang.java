/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081;


/**
 *
 * @author LONGDT
 */
public class MatHang implements Comparable<MatHang>{
    private String ma;
    private String name;
    private String DV;
    private int giamua;
    private int giaban;
    
    public MatHang(){
        
    }
    public MatHang(String ma, String name, String DV, String giamua, String giaban){
        this.ma = ma;
        this.name = name;
        this.DV = DV;
        this.giamua = Integer.parseInt(giamua);
        this.giaban = Integer.parseInt(giaban);
    }
    private int loinhuan(){
        return this.giaban - this.giamua;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d %d", ma, name, DV, giamua, giaban, loinhuan());
    }

    @Override
    public int compareTo(MatHang m) {
        if(this.loinhuan() > m.loinhuan()){
            return 1;
        }else if(this.loinhuan() < m.loinhuan()){
            return -1;
        }else{
            return 0;
        }
    }
}
