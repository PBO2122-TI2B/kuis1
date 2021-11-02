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
public class PersegiPanjang {
   private int alas;
   private int tinggi;
   
   
   public void setAlas(int newAlas){
       this.alas = newAlas;
   }
   
   public void setTinggi(int newTinggi){
       this.tinggi = newTinggi;
   }
   
   public int getAlas(){
       return this.alas;
   }
   
    public int getTinggi(){
       return this.tinggi;
   }
    
    public int getLuas(){
       return (int) (this.alas*this.tinggi);
   }
    
   public int getKeliling(){
       return (int) (2*(this.alas+this.tinggi));
   }
    
}

