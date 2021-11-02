/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author Asus X453
 */
public class Lingkaran {
     private float jari;
    public float getJari() {
    return jari;
}

    public void setJari(float jari) {
    this.jari = jari;


}
    public double getLuasLingkaran(){
    double luasLingkaran;
    luasLingkaran=3.14*jari*jari;
    return luasLingkaran;
    }
    public double getKelilingLingkaran(){
    double kelilingLingkaran;
    kelilingLingkaran= 2*3.14*jari;
    return kelilingLingkaran;
    }

    public void setjari(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
