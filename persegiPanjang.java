/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo1;

/**
 *
 * @author Chaidir Wiradhika
 */
public class persegiPanjang {
    private int panjang;
    private int lebar;
   
    public void setPanjang(int newPanjang) {
        this.panjang = newPanjang;
    }
    public void setLebar(int newLebar) {
        this.lebar = newLebar;
    }
    public int getPanjang() {
        return this.panjang;
    }
    public int getLebar() {
        return this.lebar;
    }
    public double getLuas(){
        return this.panjang*this.lebar;
    }
    public int getKeliling(){
        return 2*(this.panjang+this.lebar);
    }
    public void cetak(){
        System.out.println("Panjang        : "+panjang);
        System.out.println("Lebar          : "+lebar);
    }
}