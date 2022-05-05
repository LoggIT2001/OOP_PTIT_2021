/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07035;

/**
 *
 * @author LONGDT
 */
public class MonHoc {
    private String ma,ten;
    private int tinchi;
    public MonHoc(String ma,String ten,int tinchi){
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
    }
    public String Getmamh(){
        return ma;
    }
    public String Getten(){
        return ten;
    }
}
