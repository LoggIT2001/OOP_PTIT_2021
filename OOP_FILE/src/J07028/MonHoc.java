/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07028;

/**
 *
 * @author LONGDT
 */
public class MonHoc {
    private String s;
    
    public MonHoc(){
        
    }
    public MonHoc(String s){
        this.s = s;
    }
    public String id(){
        String[] tmp = s.split("\\s+");
        String res = "";
        res = tmp[0];
        return res;
    }
    public String nameMH(){
        String[] tmp = s.split("\\s+");
        String res = "";
        for(int i=1;i<tmp.length;i++){
            if(tmp[i].length()>0){
                res+=tmp[i] + " ";
            }
        }
        return res;
    }
}
