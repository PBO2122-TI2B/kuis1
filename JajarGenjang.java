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
public class JajarGenjang {
   private int alas;
   private int tinggi;
   private int sisimrg;
   
   
   public void setAlas(int newAlas){
       this.alas = newAlas;
   }
   
   public void setTinggi(int newTinggi){
       this.tinggi = newTinggi;
   }
   
   public void setSisimrg(int newSisimrg){
       this.sisimrg = newSisimrg;
   }
   
   public int getAlas(){
       return this.alas;
   }
   
    public int getTinggi(){
       return this.tinggi;
   }
    
     public int getSisimrg(){
       return this.sisimrg;
   }
    
    public int getLuas(){
       return (int) (this.alas*this.tinggi);
   }
    
   public int getKeliling(){
       return (int) (2*(this.alas+this.sisimrg));
   }
    
}


    

