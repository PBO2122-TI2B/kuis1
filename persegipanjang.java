/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

/**
 *
 * @author ASUS
 */
public class persegipanjang {
    private float panjang;
    private float lebar;

public float getPanjang() {
return panjang;

}
public void setPanjang(float panjang) {
this.panjang = panjang;

}
public float getLebar() {
return lebar;

}
public void setLebar(float Lebar) {
this.lebar =  Lebar;

}

public double getLuaspersegipanjang(){

double luaspersegipanjang;

luaspersegipanjang=panjang * lebar;

return luaspersegipanjang;

}
public double getKelilingPersegipanjang(){
    double  kelilingpersegipanjang;
    kelilingpersegipanjang = 2* (panjang + lebar);
    return kelilingpersegipanjang;
}
}

    


