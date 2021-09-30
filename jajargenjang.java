public class jajargenjang {
    private float alas;
    private float tinggi;
    private float miring;

public float getalas() {
return alas;

}
public void setAlas(float alas) {
this.alas = alas;

}
public float getTinggi() {
return tinggi;

}
public void setTinggi(float tinggi) {
this.tinggi =  tinggi;

}
public float getMiring() {
return miring;

}
public void setMiring(float miring) {
this.miring =  miring;

}

public double getLuasJajargenjang(){

double luasjajargenjang;

luasjajargenjang= alas * tinggi;

return luasjajargenjang;

}
public double getKelilingJajargenjang(){
    double  kelilingjajargenjang;
    kelilingjajargenjang = 2*(alas + miring);
    return kelilingjajargenjang;
}
}