package BangungDatar;
public class JajarGenjang {
    private double alas;
    private double tinggi;
    private double sisiMiring;
    public void setAlas(double a){
        alas = a;
    }
    public void setTinggi(double t){
        tinggi = t;
    }
    public void setSisiMiring(double sm){
        sisiMiring = sm;
    }
    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getSisiMiring(){
        return sisiMiring;
    }
    public double menghitungKeliling(){
        double keliling = 2*(alas+tinggi+sisiMiring);
        return keliling;
    }
    public double menghitungLuas(){
        double luas = alas*tinggi;
        return luas;
    }
}
