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
public class Persegi {
    private int sisi;
    
    public void setSisi(int s){
        this.sisi = s;
    }
    
    public int getLuas(int s){
        int luas = s*s;
        return luas;
    }
    
    public int getKeliling(int s){
        int keliling = 4*s;
        return keliling;
    }
}
