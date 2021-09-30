/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Aku
 */
public class JajarGenjang {
    private int alas,tinggi,sisi_miring;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisi_miring() {
        return sisi_miring;
    }
    
    public int luasJajarGenjang(){
        return getAlas()*getTinggi();
    }
    
    public int kelilingJajarGenjang(){
        return 2*(getAlas()+getSisi_miring());
    }
}
