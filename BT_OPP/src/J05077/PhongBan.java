/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05077;

/**
 *
 * @author LONGDT
 */
public class PhongBan {
    private String str;

    public PhongBan() {
    }

    public PhongBan(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    
    public String idPB(){
        String[] s = this.str.split("\\s+");
        return s[0];
    }
    public String namePB(){
        String[] s = this.str.split("\\s+");
        String res="";
        for(int i=1;i<s.length;i++){
            if(s[i].length()>0){
                res+=s[i] + " ";
            }
        }
        return res;
    }
}
