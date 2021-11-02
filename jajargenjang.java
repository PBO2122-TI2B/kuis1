/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajargenjang;

/**
 *
 * @author ASUS
 */
public class jajargenjang {
    private float alas;
    private float tinggi;
    private float miring;

public float getalas() {
return alas;

}
public void setAlas(float alas) {
this.alas = alas;

}
public float getTinggi() {
return tinggi;

}
public void setTinggi(float tinggi) {
this.tinggi =  tinggi;

}
public float getMiring() {
return miring;

}
public void setMiring(float miring) {
this.miring =  miring;

}

public double getLuasJajargenjang(){

double luasjajargenjang;

luasjajargenjang= alas * tinggi;

return luasjajargenjang;

}
public double getKelilingJajargenjang(){
    double  kelilingjajargenjang;
    kelilingjajargenjang = 2*(alas + miring);
    return kelilingjajargenjang;
}
}
