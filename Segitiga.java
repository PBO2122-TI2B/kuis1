/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private float alas;

private float tinggi;
private float miring;

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
public float getMiring() {

return miring;

}

public void setMiring(float Miring) {

this.miring = miring;

}


public double getLuasSegitiga(){

double luassegitiga;

luassegitiga=0.5*alas*tinggi;

return luassegitiga;

}
public double getKelilingSegitiga(){
    double  kelilingsegitiga;
    kelilingsegitiga = alas + tinggi + miring;
    return kelilingsegitiga;
}
}
