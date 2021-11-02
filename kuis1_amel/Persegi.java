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
public class Persegi {
    private int sisi;
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    
    public int luasPersegi(){
        int luas = sisi*sisi;
        System.out.println("Luas Persegi: " +luas);
        return luas;
    }
    public int kelPersegi(){
        int kel = 4*sisi;
        System.out.println("Keliling Persegi: " +kel);
        return kel;
    }
}
