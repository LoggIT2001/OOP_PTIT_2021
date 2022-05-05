/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07037;

/**
 *
 * @author LONGDT
 */
public class DN implements Comparable<DN>{
    private String id, name;
    private int sl;

    public DN() {
    }

    public DN(String id, String name, String sl) {
        this.id = id;
        this.name = name;
        this.sl = Integer.parseInt(sl);
    }

    @Override
    public int compareTo(DN o) {
        if(this.id.compareTo(o.id)<0){
            return 1;
        }else if(this.id.compareTo(o.id)>0){
            return -1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, sl);
    }
}
