package Kuis1;

import java.util.*;
public class Segitiga {
    private double a, b, c;

    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(){
        double s = ((a * a) + (b * b));
        c = Math.sqrt(s);
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double hitungLuas(){
        return  0.5 * (a * b);
    }
    public double hitungKeliling(){
        return  a+b+c;
    }
}
