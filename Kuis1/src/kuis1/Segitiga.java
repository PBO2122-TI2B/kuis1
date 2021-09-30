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
public class Segitiga {
    private float tinggi;
    private float alas;
    private float miring;
    
    public float getTinggi(float tinggi){
        return tinggi;
    }
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    public float getAlas(float alas){
        return alas;
    }
    public void setAlas(float alas){
        this.alas = alas;
    }
    public float getMiring(float miring) {
        return miring;
    }
    public void setMiring(float Miring) {
        this.miring = miring;
    }
    public double getLuasSegitiga(){
        double Luassegitiga;
        Luassegitiga = 0.5*alas*tinggi;
        return Luassegitiga;
    }
    public double getKelilingSegitiga(){
        double Kelilingsegitiga;
        Kelilingsegitiga = alas+tinggi+miring;
        return Kelilingsegitiga;
    }
}
