/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author ASUS
 */
public class lingkaran {
    private float r;
    public float getJariJari() {
        return r;
    }
    public void setjariJari(float r) {
        this.r = r;
    }
    public double getLuasLingkaran() {
        double luaslingkaran;
        luaslingkaran = 3.14 *r*r;
        return luaslingkaran; 
    }
     public double getKelilingLingkaran() {
        double kelilinglingkaran;
        kelilinglingkaran =2* 3.14 *r*r;
        return kelilinglingkaran; 
    }


}
