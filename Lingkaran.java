package Kuis1;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Lingkaran {
    //declaration attribute
    private double phi;
    private double r;
    
    //constructor
    Lingkaran(double r){
        this.r = r;
        this.phi = 3.14;
    }
    
    //declaration method
    public double getJariJari(){
        return r;
    }
    public void setJariJari(int newJariJari){
        r = newJariJari;
    }
    public double hitungLuas(double r)
    {
        double luas = phi * r * r;
        return luas;
    }
    public double hitungKeliling(double r)
    {
        double keliling = 2 * phi * r;
        return keliling;
    }
}
