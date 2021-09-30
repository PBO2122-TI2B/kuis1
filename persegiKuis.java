public class persegiKuis {
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
