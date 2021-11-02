/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

/**
 *
 * @author Asus X453
 */
public class PersegiPanjang {
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
    public void setLebar(float tinggi) {
    this.lebar = lebar;

}
    public double getLuasPersegiPanjang(){
    double luasPersegiPanjang;
    luasPersegiPanjang=panjang*lebar;
    return luasPersegiPanjang;
    }
    public double getKelilingPersegiPanjang(){
    double kelilingPersegiPanjang;
    kelilingPersegiPanjang= 2*(panjang+lebar);
    return kelilingPersegiPanjang;
    }
}
