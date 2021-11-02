/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number5;

/**
 *
 * @author ALIFIYUL
 */
public class JajarGenjang {
   private float alas1;

    private float tinggi1;
    private float sisiMiring;

    public float getAlas() {
        return alas1;
    }


    public void setAlas(float alas1) {
        this.alas1 = alas1;
    }

    public float getTinggi() {
        return tinggi1;
    }

    public void setTinggi(float tinggi1) {
        this.tinggi1 = tinggi1;
    }

    public float getsisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(float sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    public double getLuasJajarGenjang() {
        double luasJajarGenjang;
        luasJajarGenjang = alas1 * tinggi1;
        return luasJajarGenjang;
    }
    public double getkelilingJajarGenjang(){
        double kelilingJajarGenjang;
        kelilingJajarGenjang=2*(alas1+sisiMiring);
        return kelilingJajarGenjang;
    }

}
