/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi;

/**
 *
 * @author ASUS
 */
public class persegi {
    private float sisi;

public float getSisi() {
return sisi;

}
public void setSisi(float sisi) {
this.sisi = sisi;

}




public double getLuaspersegi(){

double luaspersegi;

luaspersegi=sisi * sisi;

return luaspersegi;

}
public double getKelilingPersegi(){
    double  kelilingpersegi;
    kelilingpersegi = 4 * sisi;
    return kelilingpersegi;
}

    
}
