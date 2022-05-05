/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05070;

/**
 *
 * @author LONGDT
 */
public class CauLacBo {
    private String id;
    private String name;
    private int gia;

    public CauLacBo() {
    }

    public CauLacBo(String id, String name, String gia) {
        this.id = id;
        this.name = name;
        this.gia = Integer.parseInt(gia);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }
}
