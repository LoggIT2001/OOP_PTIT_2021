/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06008;

/**
 *
 * @author LONGDT
 */
public class MonHoc {
    private String s;

    public MonHoc() {
    }

    public MonHoc(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    
    public String idMH(){
        String[] tmp = this.s.split("\\s+");
        return tmp[0];
    }
    public String tenMH(){
        String[] tmp = this.s.split("\\s+");
        String res="";
        for(int i=1;i<tmp.length;i++){
            if(tmp[i].length()>0){
                res+=tmp[i] + " ";
            }
        }
        return res;
    }
}
