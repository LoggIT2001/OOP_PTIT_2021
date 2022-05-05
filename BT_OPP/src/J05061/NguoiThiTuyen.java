/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05061;

/**
 *
 * @author LONGDT
 */
public class NguoiThiTuyen implements Comparable<NguoiThiTuyen>{
    private String MTT;
    private String name;
    private String ns;
    private float lt;
    private float th;
    
    public NguoiThiTuyen(){
        
    }
    public NguoiThiTuyen(String MTT, String name, String ns, String lt, String th){
        this.MTT = MTT;
        this.name = name;
        this.ns = ns;
        this.lt = Float.parseFloat(lt);
        this.th = Float.parseFloat(th);
    }
    private int tuoi(){
        String[] s = this.ns.split("/");
        int x = s.length -1;
        int tmp = Integer.parseInt(s[x]);
        return (2021-tmp);
    }
    private int diem(){
        float thuong=0;
        if(this.lt >=8 && this.th>=8){
            thuong=1;
        }else if(this.lt >=7.5 && this.th >=7.5){
            thuong=(float)0.5;
        }else{
            thuong=0;
        }
        float sum = (this.lt + this.th)/2 + thuong;
        int res = (Math.round(sum));
        if(res>10){
            return 10;
        }else{
            return res;
        }
    }
    private String xepLoai(){
        String res="";
        if(this.diem()>=9){
            res="Xuat sac";
        }else if(this.diem()>=8){
            res="Gioi";
        }else if(this.diem()>=7){
            res="Kha";
        }else if(this.diem()>=5){
            res="Trung binh";
        }else{
            res="Truot";
        }
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %s", MTT, name, tuoi(), diem(), xepLoai());
    }

    @Override
    public int compareTo(NguoiThiTuyen ntt) {
      if(this.diem()>ntt.diem()){
          return 1;
      }else if(this.diem()<ntt.diem()){
          return -1;
      }else{
          if(this.MTT.compareTo(ntt.MTT)<0){
              return 1;
          }else if(this.MTT.compareTo(ntt.MTT)>0){
              return -1;
          }else{
              return 0;
          }
      }
    }
}
