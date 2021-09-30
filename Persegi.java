/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author acer
 */
public class Persegi {
    private int sisi;
    
    public void setSisi(int s){
        this.sisi = s;
    }
    
    public int getLuas(){
        int luas = sisi * sisi;
        return luas;
    }
    
    public int getKeliling(){
        int keliling = 4 * sisi;
        return keliling;
    }
    
    public void cetak(){
        System.out.println("Sisi : "+sisi);
    }
}
