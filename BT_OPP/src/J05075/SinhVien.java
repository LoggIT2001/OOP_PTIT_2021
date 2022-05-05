/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05075;

/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String id,name,lop;
    private DiemDanh dd;
    
    public SinhVien(){
        
    }
    public SinhVien(String id, String name, String lop){
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public void setDd(DiemDanh dd) {
        this.dd = dd;
    }
    public String getId(){
        return this.id;
    }
    public String getLop() {
        return lop;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + lop + " " + dd.diem();
    }
}
