/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06007;

/**
 *
 * @author LONGDT
 */
public class BangGioChuan {
    private String s;
    
    public BangGioChuan(){
        
    }
    public BangGioChuan(String s){
        this.s = s;
    }

    public String getS() {
        return s;
    }
    
    public String IdGV(){
        String[] tmp = s.split("\\s+");
        String res="";
        res=tmp[0];
        return res;
    }
    public String IdMH(){
        String[] tmp = s.split("\\s+");
        String res="";
        res=tmp[1];
        return res;
    }
    public float time(){
        String[] tmp = s.split("\\s+");
        String res="";
        res=tmp[2];
        return Float.parseFloat(res);
    }
}
