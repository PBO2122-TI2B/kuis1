/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author LENOVO
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
    
    public int getLuas(int p, int l){
        int luas = p*l;
        return luas;
    }
    
    public int getKeliling(int p, int l){
        int keliling = 2*(p+l);
        return keliling;
    }
}
