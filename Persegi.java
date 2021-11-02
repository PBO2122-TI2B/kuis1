/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

/**
 *
 * @author ALIFIYUL
 */
public class Persegi {
    private float Sisi;

    public float getSisi() {
        return Sisi;
    }
    public void setSisiPersegi(float Sisi) {
        this.Sisi = Sisi;
    }

    public double getluasPersegi(){
        double luasPersegi;
        luasPersegi=Sisi*Sisi;
        return luasPersegi;
    }
     public double getkelilingPersegi(){
        double kelilingPersegi;
        kelilingPersegi=4*Sisi;
        return kelilingPersegi;
    }

}
