/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06001;

/**
 *
 * @author LONGDT
 */
public class SanPham {
    private String id;
    private String name;
    private int dg1;
    private int dg2;
    
    public SanPham(){
        
    }

    public SanPham(String id, String name, String dg1, String dg2) {
        this.id = id;
        this.name = name;
        this.dg1 = Integer.parseInt(dg1);
        this.dg2 = Integer.parseInt(dg2);
    }
    public String getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public int getDg1() {
        return dg1;
    }

    public int getDg2() {
        return dg2;
    }
    
}
