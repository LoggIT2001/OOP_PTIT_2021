/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06003;

/**
 *
 * @author LONGDT
 */
public class Nhom {
    private int stt;
    private String name;
    
    public Nhom(int stt){
        this.stt = stt;
    }

    public Nhom(int stt, String name) {
        this.stt = stt;
        this.name = name;
    }

    public int getStt() {
        return stt;
    }

    public String getName() {
        return name;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
