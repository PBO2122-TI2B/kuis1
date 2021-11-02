/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi;

/**
 *
 * @author Asus X453
 */
public class Persegi {

    private double sisi;
    public double getSisi() {
    return  sisi;
}

   public void setSisi(double sisi) {
    this.sisi = sisi;

}
    public double getLuasPersegi(){
    double luaspersegi;
    luaspersegi=sisi*sisi;
    return luaspersegi;
    }
    public double getKelilingPersegi(){
    double kelilingPersegi;
    kelilingPersegi = 4*sisi;
    return kelilingPersegi;
    }
   }
