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
public class PersegiFarah {
   private int sisi;
   
   
   public void setSisi(int newSisi){
       this.sisi = newSisi;
   }
   
   public int getSisi(){
       return this.sisi;
   }
    
    public int getLuas(){
       return (int) (this.sisi*this.sisi);
   }
    
   public int getKeliling(){
       return (int) (this.sisi*4);
   }
    
}


