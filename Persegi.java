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
public class Persegi {
    private int sisi;
   
    public void setSisi(int newSisi) {
        this.sisi = newSisi;
    }
    public int getSisi() {
        return this.sisi;
    }
    public int getLuas(){
        return this.sisi*this.sisi;
    }
    public int getKeliling(){
        return 4*this.sisi;
    }
    public void cetak(){
        System.out.println("Sisi        : "+sisi);
    }
}