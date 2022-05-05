/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05079;

/**
 *
 * @author LONGDT
 */
public class LopHoc implements Comparable<LopHoc>{
    private String mamon , nameclass ,idnhom , nameteach;

    public LopHoc(String mamon, String nameclass, String idnhom, String nameteach) {
        this.mamon = mamon;
        this.nameclass = nameclass;
        this.idnhom = idnhom;
        this.nameteach = nameteach;
    }
    public boolean checkID(String s){
        if(s.equals(mamon)) return true;
        else return false;
    }
    public String getNameclass() {
        return nameclass;
    }

    @Override
    public int compareTo(LopHoc o) {
        return this.idnhom.compareTo(o.idnhom);
    }
    
    @Override
    public String toString() {
        return  idnhom + " " + nameteach;
    }
}
