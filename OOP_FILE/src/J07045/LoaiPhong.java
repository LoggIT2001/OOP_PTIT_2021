/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07045;

/**
 *
 * @author LONGDT
 */
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String s;

    public LoaiPhong() {
    }

    public LoaiPhong(String s) {
        this.s = s;
    }
    
    private String name(){
        String[] tmp = s.split("\\s+");
        return tmp[1];
    }

    @Override
    public int compareTo(LoaiPhong o) {
        if(this.name().compareTo(o.name())>0){
            return 1;
        }else if(this.name().compareTo(o.name())<0){
            return -1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return s;
    }
}
