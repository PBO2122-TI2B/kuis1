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
public class Segitiga {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return Math.sqrt((getA()*getA())+(getB()*getB()));
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double luasSegitiga(){
        return 1/2*(getA()+getB());
    }
    
    public double kelilingSegitiga(){
        return getA()+getB()+getC();
    }
}
