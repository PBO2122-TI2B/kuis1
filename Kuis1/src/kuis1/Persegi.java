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
public class Persegi {
    private float sisi;
    
    public float getSisi() {
    return sisi;
    }
    public void setSisi(float sisi) {
    this.sisi = sisi;
    }
    public double getLuaspersegi(){
    double luaspersegi;
    luaspersegi=sisi * sisi;
    return luaspersegi;
    }
    public double getKelilingpersegi(){
        double KelilingPersegi;
        KelilingPersegi = 4*sisi;
        return KelilingPersegi;
    }
}
