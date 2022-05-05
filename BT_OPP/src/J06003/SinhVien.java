/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

/**
 *
 * @author LONGDT
 */
public class SinhVien {
    private String ma;
    private String name;
    private String phone;
    private Nhom group;
    
    public SinhVien(){
        
    }

    public SinhVien(String ma, String name, String phone, Nhom group) {
        this.ma = ma;
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public Nhom getGroup() {
        return group;
    }
    
    @Override
    public String toString() {
        return ma + " " + name + " " + phone;
    }
    
    
}
