/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

/**
 *
 * @author USER
 */
public class LingkaranFarah {
   private final double phi;
   private int r;
   
   LingkaranFarah(){
       phi = 3.14;
   }
   
   public void setR(int newR){
       this.r = newR;
   }
   
   public int getR(){
       return this.r;
   }
   
    public int getLuas1(){
       return (int) (phi*this.r*this.r);
   }
    
    public int getKeliling1(){
       return (int) (2*phi*this.r);
   }
}

    

