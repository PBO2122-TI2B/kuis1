/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number4;

/**
 *
 * @author ALIFIYUL
 */
public class Lingkaran {
    private float r;

    public float getJariJari() {
        return r;
    }
    public void setJariJari(float r) {
        this.r = r;
    }

    public double getLuasLingkaran(){
        double luasLingkaran;
        luasLingkaran = 3.14*r*r;
        return luasLingkaran;
    }
     public double getKelilingLingkaran(){
        double kelilingLingkaran;
        kelilingLingkaran=2*3.14*r;
        return kelilingLingkaran;
    }
}

   
