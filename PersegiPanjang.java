/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number3;

/**
 *
 * @author ALIFIYUL
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public float getPanjang() {
        return panjang;
    }
    public float getLebar() {
        return lebar;
    }
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public double getluasPersegiPanjang(){
        double luasPersegiPanjang;
        luasPersegiPanjang=panjang*lebar;
        return luasPersegiPanjang;
    }
     public double getkelilingPersegiPanjang(){
        double kelilingPersegiPanjang;
        kelilingPersegiPanjang=2*(panjang+lebar);
        return kelilingPersegiPanjang;
    }

}
