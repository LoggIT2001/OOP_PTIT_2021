/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07048;

/**
 *
 * @author LONGDT
 */
public class SanPham implements Comparable<SanPham>{
    private String id, name;
    private int gia, time;

    public SanPham() {
    }

    public SanPham(String id, String name, String gia, String time) {
        this.id = id;
        this.name = name;
        this.gia = Integer.parseInt(gia);
        this.time = Integer.parseInt(time);
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.gia>o.gia){
            return 1;
        }else if(this.gia<o.gia){
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
    public String toString(){
        return String.format("%s %s %d %d", id, name, gia, time);
    }
}
