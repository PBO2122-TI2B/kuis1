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
public class JajarGenjang {
    private int alas;
    private int tinggi;
    private int c;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void setC(int c){
        this.c = c;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int getC(){
        return c;
    }
    
    public int luasJajarGenjang(){
        int luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang: " +luas);
        return luas;
    }
    public int kelJajarGenjang(){
        int kel = 2*(alas+c);
        System.out.println("Keliling Jajar Genjang: " +kel);
        return kel;
    }
}
