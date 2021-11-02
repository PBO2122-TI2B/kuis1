/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JajarG;

/**
 *
 * @author Asus X453
 */
public class JajarGenjang {
    private float alas;
    private float tinggi;
    private float sisimiring;
    public float getAlas() {
    return alas;
}

    public void setAlas(float alas) {
    this.alas = alas;

}
    public float getTinggi() {
    return tinggi;

}
    public void setTinggi(float tinggi) {
    this.tinggi = tinggi;

}
    public float getSisimiring() {
    return sisimiring;
    
    }
    public void setSisimiring(float sisimiring) {
    this.sisimiring = sisimiring;
    }
    
    public double getLuasJajarGenjang(){
    double luasJajarGenjang;
    luasJajarGenjang=alas*tinggi;
    return luasJajarGenjang;
    }
    public double getKelilingJajarGenjang(){
    double kelilingJajarGenjang;
    kelilingJajarGenjang= 2*(alas+sisimiring);
    return kelilingJajarGenjang;
    }

    public void setSisi(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
