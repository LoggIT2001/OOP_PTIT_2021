/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05074;

/**
 *
 * @author LONGDT
 */
public class DiemDanh {
    private String str;
    
    public DiemDanh(){
        
    }
    public DiemDanh(String str){
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }
    
    public String id(){
        String[] s = str.split("\\s+");
        return s[0];
    }
    public String diem(){
        String[] s = str.split("\\s+");
        int d = 10;
        String tmp = s[1];
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)=='x'){
                d-=0;
            }else if(tmp.charAt(i)=='m'){
                d-=1;
            }else if(tmp.charAt(i)=='v'){
                d-=2;
            }
        }
        String res = "";
        if(d<=0){
            res = "0 KDDK";
        }else{
            res = String.valueOf(d);
        }
        return res;
    }

}
