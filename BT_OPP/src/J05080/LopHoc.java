/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05080;

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
    public String getNameclass() {
        return nameclass;
    }

    public String getNameteach() {
        return nameteach;
    }
    
    @Override
    public int compareTo(LopHoc o) {
        if(this.mamon.compareTo(o.mamon)>0){
            return 1;
        }else if(this.mamon.compareTo(o.mamon)<0){
            return -1;
        }else{
            if(this.idnhom.compareTo(o.idnhom)>0){
                return 1;
            }else if(this.idnhom.compareTo(o.idnhom)<0){
                return -1;
            }else{
                return 0;
            }
        }
    }
    
    @Override
    public String toString() {
        return  mamon + " " + nameclass + " " + idnhom;
    }
}
