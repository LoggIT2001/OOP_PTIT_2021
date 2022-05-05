/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07012;

/**
 *
 * @author LONGDT
 */
public class Sorting implements Comparable<Sorting>{
    private String key;
    private int value;
    public Sorting(String key,int value ){
        this.key=key;
        this.value=value;
    }
    public String toString(){
    return key+" "+value;
    }
   

    @Override
    public int compareTo(Sorting o) {
       if (this.value == o.value)
            return this.key.compareTo(o.key);
        return this.value > o.value ? -1 : 1;
    }
}
