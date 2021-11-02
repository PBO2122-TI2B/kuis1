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
public class Segitiga {
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
        int luas = 1/2*a*t;
        return luas;
    }
    
    public int getKeliling(int a, int t, int s){
        int keliling = a+t+s;
        return keliling;
    }

    String getTinggi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getTinggi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
