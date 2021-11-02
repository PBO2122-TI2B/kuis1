/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuistest;

/**
 *
 * @author Amelia
 */
public class Segitiga {
    private int alas;
    private int tinggi;
    private double c;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double sisiMiring(){
        double s = ((alas/2)*(alas/2)) + (tinggi*tinggi);
        c = Math.sqrt(s);
        return c;
    }
    public int luasSegitiga(){
        int luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga: " +luas);
        return luas;
    }
    public int kelSegitiga(){
        int kel = (int) (alas + sisiMiring() + sisiMiring());
        System.out.println("Keliling Segitiga: " +kel);
        return kel;
    }
}
