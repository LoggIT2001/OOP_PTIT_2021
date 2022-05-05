/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LONGDT
 */
public class KhachHang {
    private String id;
    private String name;
    private String gt;
    private Date ns;
    private String address;
    
    public KhachHang(){
        
    }
    public KhachHang(String id, String name, String gt, String ns, String address) throws ParseException{
        this.id=id;
        this.name=name;
        this.gt=gt;
        this.ns = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        this.address=address;
    }
    @Override
    public String toString(){
        return name + " " + address;
    }
}
