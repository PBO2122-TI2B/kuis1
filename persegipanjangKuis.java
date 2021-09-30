public class persegipanjangKuis {
    private float panjang;
    private float lebar;

public float getPanjang() {
return panjang;

}
public void setPanjang(float panjang) {
this.panjang = panjang;

}
public float getLebar() {
return lebar;

}
public void setLebar(float Lebar) {
this.lebar =  Lebar;

}

public double getLuaspersegipanjang(){

double luaspersegipanjang;

luaspersegipanjang=panjang * lebar;

return luaspersegipanjang;

}
public double getKelilingPersegipanjang(){
    double  kelilingpersegipanjang;
    kelilingpersegipanjang = 2* (panjang + lebar);
    return kelilingpersegipanjang;
}
}