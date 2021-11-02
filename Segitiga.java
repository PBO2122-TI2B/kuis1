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
public class Segitiga {
    private int alas;
    private int tinggi;
    private int sisi;
   
    public void setAlas(int newAlas) {
        this.alas = newAlas;
    }
    public void setSisi(int newSisi) {
        this.sisi = newSisi;
    }
    public void setTinggi(int newTinggi) {
        this.tinggi = newTinggi;
    }
    public int getAlas() {
        return this.alas;
    }
    public int getSisi() {
        return this.sisi;
    }
    public int getTinggi() {
        return this.tinggi;
    }
    public double getLuas(){
        return 0.5*this.alas*this.tinggi;
    }
    public int getKeliling(){
        return 3*this.sisi;
    }
    public void cetak(){
        System.out.println("Alas        : "+alas);
        System.out.println("Tinggi      : "+tinggi);
        System.out.println("Sisi        : "+sisi);
    }
}