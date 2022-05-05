/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05027;

/**
 *
 * @author LONGDT
 */
public class GiangVien {
    private String name;
    private String boMon;
    private String ma;
    
    public GiangVien(){
        
    }
    public GiangVien(String ma, String name, String boMon){
        this.ma = ma;
        this.name = name;
        this.boMon = boMon;
    }
    public String getName(){
        return this.name;
    }
    private String BM(){
        String[] s = this.boMon.toUpperCase().split("\\s+");
        String res="";
        for(int i=0;i<s.length;i++){
            if(s[i].length()>0){
                char[] c = s[i].toCharArray();
                res+=String.valueOf(c[0]);
            }
        }
        return res;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s", ma, name, BM());
    }
}
