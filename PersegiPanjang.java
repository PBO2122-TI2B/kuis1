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
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    public void setPanjang(int p){
        this.panjang = p;
    }
    
    public void setLebar(int l){
        this.lebar = l;
    }
    
    public int getLuas(){
        int luas = panjang * lebar;
        return luas;
    }
    
    public int getKeliling(){
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
    
    public void cetak(){
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
    }
}
