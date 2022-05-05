/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07034;

/**
 *
 * @author LONGDT
 */
public class MonHoc implements Comparable<MonHoc>{
    private String id,name;
    private int tc;

    public MonHoc() {
    }

    public MonHoc(String id, String name, String tc) {
        this.id = id;
        this.name = name;
        this.tc = Integer.parseInt(tc);
    }

    @Override
    public int compareTo(MonHoc o) {
        if(this.name.compareTo(o.name)<0){
            return 1;
        }else if(this.name.compareTo(o.name)>0){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", id, name, tc);
    }
}
