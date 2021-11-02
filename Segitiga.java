package Kuis1;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Segitiga {
    //declaration attribute
    private double a;
    private double b;
    private double c;
    
    //constructor
    Segitiga(double a, double b){
        this.a = a;
        this.b = b;
    }
    //declaration method
    public void setAlas(double newAlas)
    {
        a = newAlas;
    } 
    public double getAlas(){
        return a;
    }
    public void setTinggi(double newTinggi){
        b = newTinggi;
    }
    public double getTinggi(){
        return b;
    }
    private double hitungSisiMiring(){
        this.c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        return c;
    }
    public double hitungLuas(double a, double b)
    {
        double luas = 0.5 * (a + b);
        return luas;
    }
    public double hitungKeliling(double a, double b)
    {
        double keliling = a + b + hitungSisiMiring();
        return keliling;
    }
}
