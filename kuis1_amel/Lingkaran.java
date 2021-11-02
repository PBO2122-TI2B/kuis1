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
public class Lingkaran {
    private float r;
    
    public void setJariJari(float r){
        this.r = r;
    }
    public float getJariJari(){
        return r;
    }
    
    public float luasLingkaran(){
        float luas = (float) (3.14 * r * r);
        System.out.println("Luas lingkaran: " +luas);
        return luas;
    }
    public float kelLingkaran(){
        float kel = (float) (2 * 3.14 * r);
        System.out.println("Keliling lingkaran: " +kel);
        return kel;
    }
}
