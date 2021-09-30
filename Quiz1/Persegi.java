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
public class Persegi {
    private int s;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    public int luasPersegi(){
        return getS()*getS();
    }
    
    public int kelilingPersegi(){
        return 4*getS();
    }
}
