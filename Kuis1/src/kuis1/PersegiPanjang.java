/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author SMK TELKOM
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
    public int getLuasPersegiPanjang(){
        int luas = panjang * lebar;
        return luas;
    }
    public int getKelilingPersegiPanjang(){
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
    public void cetakPersegiPanjang(){
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
    }
   
}
