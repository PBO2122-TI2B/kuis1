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
public class SegitigaFarah {
   private int alas;
   private int tinggi;
   private int bawah;
   
   public void setAlas(int newAlas){
       this.alas = newAlas;
   }
   
   public void setTinggi(int newTinggi){
       this.tinggi = newTinggi;
   }
   
   public void setBawah(int newBawah){
       this.bawah = newBawah;
   }
   
   public int getAlas(){
       return this.alas;
   }
   
    public int getTinggi(){
       return this.tinggi;
   }
    
    public int getBawah(){
       return this.bawah;
   }
    
    public int getLuas(){
       return (int) (0.5*this.alas*this.tinggi);
   }
    
   public int getKeliling(){
       return (int) (this.alas+this.bawah+this.tinggi);
   }
    
}

