/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05048;

/**
 *
 * @author LONGDT
 */
public class Hang {
    private String ma;
    private int nhap;
    
    public Hang(){
        
    }
    public Hang(String ma, String nhap){
        this.ma = ma;
        this.nhap = Integer.parseInt(nhap);
    }
    
    private int xuat(){
        char[] c =this.ma.toCharArray();
        int res=0;
        if(c[0]=='A'){
            res= (int)(Math.round(this.nhap*60/100 /10)*10);
        }else if(c[0]=='B'){
            res= (int)(Math.round(this.nhap*70/100 /10)*10);
        }
        return res;
    }
    private int donGia(){
        char[] c = this.ma.toCharArray();
        int res=0;
        if(c[c.length-1]=='Y'){
            res=110000;
        }else if(c[c.length-1]=='N'){
            res=135000;
        }
        return res;
    }
    private long tien(){
        return this.donGia()*this.xuat();
    }
    private long thue(){
        char[] c = this.ma.toCharArray();
        long res=0;
        if(c[0]=='A'){
            if(c[c.length-1]=='Y'){
                res= this.tien()*8/100;
            }else if(c[c.length-1]=='N'){
                res= this.tien()*11/100;
            }
        }
        if(c[0]=='B'){
            if(c[c.length-1]=='Y'){
                res= this.tien()*17/100;
            }else if(c[c.length-1]=='N'){
                res= this.tien()*22/100;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d", ma, nhap, xuat(), donGia(), tien(), thue());
    }
}
