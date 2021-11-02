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
public class Jajargenjang {
    private int alas;
    private int tinggi;
    private int sisiMiring;
    
    public void setAlas(int a){
        this.alas = a;
    }
    
    public void setTinggi(int t){
        this.tinggi = t;
    }
    
    public void setSisiMiring(int s){
        this.sisiMiring = s;
    }
    
    public int getLuas(int a, int t){
        int luas = a*t;
        return luas;
    }
    
    public int getKeliling(int a, int s){
        int keliling = 2*(a+s);
        return keliling;
    }
}
