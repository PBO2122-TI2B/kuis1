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
public class JajarGenjang {
    private int alas;
    private int tinggi;
    private int sisiM;
    
    public void setAlas(int a){
        this.alas = a;
    }
    
    public void setTinggi(int t){
        this.tinggi = t;
    }
    
    public void setSisi(int s){
        this.sisiM = s;
    }
    
    public int getLuas(){
        int luas = alas * tinggi;
        return luas;
    }
    
    public int getKeliling(){
        int keliling = 2 * (alas + sisiM);
        return keliling;
    }
    
    public void cetak(){
        System.out.println("Alas        : "+alas);
        System.out.println("Tinggi      : "+tinggi);
        System.out.println("Sisi Miring : "+sisiM);
    }
}
