/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07027;

/**
 *
 * @author LONGDT
 */
public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String name;
    private String SDT;
    private Nhom group;
    private BaiTap bt;

    public SinhVien(){
    }

    public SinhVien(String id, String name, String SDT) {
        this.id = id;
        this.name = name;
        this.SDT = SDT;
    }

    public String getId() {
        return id;
    }

    public Nhom getGroup() {
        return group;
    }
    
    public void setGroup(Nhom group) {
        this.group = group;
    }

    public void setBt(BaiTap bt) {
        this.bt = bt;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + SDT + " " + String.format("%d", group.stt()) + " " + bt.getBt();
    }

    @Override
    public int compareTo(SinhVien sv) {
        if(this.id.compareTo(sv.id)>0){
            return -1;
        }else if(this.id.compareTo(sv.id)<0){
            return 1;
        }else{
            return 0;
        }
    }
}
