/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Segitiga {
    private double alas;
    private double tinggi;
    
    public void setAlas(double a){
        this.alas = a;
    }
    
    public void setTinggi(double t){
        this.tinggi = t;
    }
    
    public double getLuas(){
        double luas = 0.5 * alas * tinggi;
        return luas;
    }
    
    public double getSisiM(){
        double sisiM = (alas * 2) + (tinggi * 2);
        double sisi = sisiM / 2;
        return sisi;
    }
    
    public double getKeliling(){
        double keliling = alas + tinggi + getSisiM();
        return keliling;
    }
    
    public void cetak(){
        System.out.println("Alas    : "+alas);
        System.out.println("Tinggi  : "+tinggi);
    }
}

  
    
