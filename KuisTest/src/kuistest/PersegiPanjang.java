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
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    
    public int luasPersegiPanjang(){
        int luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " +luas);
        return luas;
    }
    public int kelPersegiPanjang(){
        int kel = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang: " +kel);
        return kel;
    }
}
