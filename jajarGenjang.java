/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo1;

/**
 *
 * @author Chaidir Wiradhika
 */
public class jajarGenjang {
    private int alas;
    private int tinggi;
    private int sisimiring;
   
    public void setAlas(int newAlas) {
        this.alas = newAlas;
    }
    public void setSisimiring(int newSisimiring) {
        this.sisimiring = newSisimiring;
    }
    public void setTinggi(int newTinggi) {
        this.tinggi = newTinggi;
    }
    public int getAlas() {
        return this.alas;
    }
    public int getSisimiring() {
        return this.sisimiring;
    }
    public int getTinggi() {
        return this.tinggi;
    }
    public double getLuas(){
        return this.alas*this.tinggi;
    }
    public int getKeliling(){
        return 2*(this.alas+this.sisimiring);
    }
    public void cetak(){
        System.out.println("Alas        : "+alas);
        System.out.println("Tinggi      : "+tinggi);
        System.out.println("Sisi Miring : "+sisimiring);
    }
}