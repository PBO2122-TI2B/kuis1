/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number1;

/**
 *
 * @author ALIFIYUL
 */
public class Segitiga {
   

    private float alas;

    private float tinggi;
    private float sisiA,sisiB,sisiC;

    public float getAlas() {
        return alas;
    }
    public float getsisiA(){
        return sisiA;
    }
    public float getsisiB(){
        return sisiB;
    }
    public float getsisiC(){
        return sisiC;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }
    public void setsisiA(float sisiA) {
        this.sisiA = sisiA;
    }
    public void setsisiB(float sisiB) {
        this.sisiB = sisiB;
    }
    public void setsisiC(float sisiC) {
        this.sisiC = sisiC;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuasSegitiga() {
        double luassegitiga;
        luassegitiga = 0.5 * alas * tinggi;
        return luassegitiga;
    }
    public double getkelilingSegitiga(){
        double kelilingSegitiga;
        kelilingSegitiga=sisiA+sisiB+sisiC;
        return kelilingSegitiga;
    }

}

