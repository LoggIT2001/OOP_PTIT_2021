/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05042;

/**
 *
 * @author LONGDT
 */
public class SinhVien implements Comparable<SinhVien>{
private String hoTen;
    private int correctAns, countSub;

    public SinhVien(String hoTen, int correctAns, int countSub) {
        this.hoTen = hoTen;
        this.correctAns = correctAns;
        this.countSub = countSub;
    }

    @Override
    public String toString() {
        return hoTen + " " + correctAns + " " + countSub;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.correctAns > o.correctAns){
            return -1;
        }else if(this.correctAns < o.correctAns){
            return 1;
        }else{
            if(this.countSub < o.countSub){
                return -1;
            }else if(this.countSub > o.countSub){
                return 1;
            }else{
                return this.hoTen.compareToIgnoreCase(o.hoTen);
            }
        }        
    }
}
