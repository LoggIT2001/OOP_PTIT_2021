/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05036;

/**
 *
 * @author LONGDT
 */
public class HangHoa {
    private String mahang,tenhang,donvitinh;
    private int phivc,thanhtien,giaban,soluong,gianhap;
    public HangHoa(int i,String tenhang,String donvitinh,int gianhap,int soluong){
        this.mahang="MH"+String.format("%02d",i);
        this.tenhang=tenhang;
        this.donvitinh=donvitinh;
        this.gianhap=gianhap;
        this.soluong=soluong;
    }
    private int phivanchuyen(){
        return (int)Math.round(this.gianhap*this.soluong*0.05);
    }
    private int thanh_tien(){
        return (int)Math.round(this.gianhap*this.soluong+phivanchuyen());
    }
    private int gia_ban(){
        return (int)Math.round(1.02*thanh_tien());
    }
    @Override
    public String toString(){
        return mahang+" "+tenhang+" "+donvitinh+" "+phivanchuyen()+" "+thanh_tien()+" "+gia_ban();
    }
}
