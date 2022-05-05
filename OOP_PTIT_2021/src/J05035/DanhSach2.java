/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05035;

/**
 *
 * @author LONGDT
 */
class DanhSach2 implements Comparable<DanhSach2> {

    private String MSV;
    private String name;
    private String lop;
    private String mail;
    private String DN;
    private int stt;
    
    public DanhSach2(){
        
    }
    public DanhSach2(int stt, String MSV, String name, String lop, String mail, String DN){
        this.stt = stt;
        this.MSV = MSV;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
        this.DN = DN;
    }
    public String getMSV(){
        return this.MSV;
    }
    public String getName(){
        return this.name;
    }
    public String getLop(){
        return this.lop;
    }
    public String getMail(){
        return this.mail;
    }
    public String getDN(){
        return this.DN;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", stt, MSV, name, lop, mail, DN);
    }

    @Override
    public int compareTo(DanhSach2 ds) {
        String x  = this.MSV;
        if(x.compareTo(ds.MSV) <0){
            return 1;
        }else if(x.compareTo(ds.MSV) >0){
            return -1;
        }else{
            return 0;
        }
    }
}
