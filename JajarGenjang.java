package Kuis1;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class JajarGenjang {
    //declaration attribute
    private double a;
    private double b;
    private double c;
    
    //constructor
    JajarGenjang(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
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
    public double hitungLuas(double a, double b)
    {
        double luas = a * b;
        return luas;
    }
    public double hitungKeliling(double a, double c)
    {
        double keliling = 2 * (a + c);
        return keliling;
    }
}
