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
public class Nhom {
    private String s;
    
    public Nhom(){
        
    }
    public Nhom(String s){
        this.s = s;
    }

    public String getS() {
        return s;
    }
    
    public String idSV(){
        String[] tmp = s.split("\\s+");
        String res="";
        res = tmp[0];
        return res;
    }
    public int stt(){
        String[] tmp = s.split("\\s+");
        return Integer.parseInt(tmp[1]);
    }
}
