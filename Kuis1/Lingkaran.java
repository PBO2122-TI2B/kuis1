/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo1;

/**
 *
 * @author Chaidir Wiradhika
 */
public class Lingkaran {
    private double phi;
    private double r;
    
    public void setPhi(double newPhi){
        this.phi = newPhi;
    }
    public void setR(double newR){
        this.r = newR;
    }
    public double getLuas(){
        double luas = phi*r*r;
        return luas;
    }
    public double getKeliling(){
        double keliling = 2*phi*r;
        return keliling;
    }
    
    public void cetak(){
        System.out.println("Jari Jari : "+r);
    }
}