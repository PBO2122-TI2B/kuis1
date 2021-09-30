/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author SMK TELKOM
 */
public class JajarGenjang {
    private float alas;
    private float tinggi;
    private float miring;
    
    public float getAlas(float alas) {
    return alas;
    }
    public float getTinggi(float tinggi) {
    return tinggi;
    }
    public float getMiring(float miring) {
    return miring;
    }
    public double getLuasJajarGenjang(){
        double LuasJajarGenjang;
        LuasJajarGenjang = alas*tinggi;
        return LuasJajarGenjang;
    }
    public double getKelilingJajarGenjang(){
       double KelilingJajarGenjang;
       KelilingJajarGenjang = 2*alas*miring;
       return KelilingJajarGenjang;
    }
}
