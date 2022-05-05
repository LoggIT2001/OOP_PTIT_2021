/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07020;

/**
 *
 * @author LONGDT
 */
public class MatHang {
    private String id;
    private String name;
    private String dvt;
    private int giamua;
    private int giaban;
    
    public MatHang(){
        
    }

    public MatHang(String id, String name, String dvt, String giamua, String giaban) {
        this.id = id;
        this.name = name;
        this.dvt = dvt;
        this.giamua = Integer.parseInt(giamua);
        this.giaban = Integer.parseInt(giaban);
    }
    public int getGiaban(){
        return this.giaban;
    }
    @Override
    public String toString(){
        return name + " " + dvt + " " + String.format("%d %d", giamua, giaban);
    }
}
