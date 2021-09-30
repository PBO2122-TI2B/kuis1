/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Aku
 */
public class Lingkaran {
    private double r;
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double luasLingkaran(){
        return 3.14*getR()*getR();
    }
    
    public double kelilingLingkaran(){
        return 2*3.14*getR();
    }
}
