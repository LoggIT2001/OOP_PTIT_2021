/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

import java.util.*;

/**
 *
 * @author LONGDT
 */
class PhanSo {

    private long tuso;
    private long mauso;

    public PhanSo() {

    };

    public PhanSo(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.tuso = sc.nextLong();
        this.mauso = sc.nextLong();
        sc.close();
    }

    private long GCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    public void rutGon() {
        long tmp = GCD(this.tuso, this.mauso);
        this.tuso = this.tuso / tmp;
        this.mauso = this.mauso / tmp;
    }

    @Override
    public String toString() {
        return this.tuso + "/" + this.mauso;
    }
}
