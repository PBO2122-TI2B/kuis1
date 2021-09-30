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
public class PersegiPanjang {
    private int p,l;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    public int luasPersegiPanjang(){
        return getP()*getL();
    }
    
    public int kelilingPersegiPanjang(){
        return 2*(getP()+getL());
    }
}
