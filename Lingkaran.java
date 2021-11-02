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
public class Lingkaran {
    private double phi;
    private double jari2;
    
    public void setJari2(double r){
        this.jari2 = r;
    }
    
    public double getLuas(double r){
        double luas = phi*r*r;
        return luas;
    }
    
    public double getKeliling(double r){
        double keliling = 2*phi*r;
        return keliling;
    }
}
