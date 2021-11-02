package BangungDatar;
public class Persegi {
    private double sisi;
    public void setSisi(double s){
        sisi = s;
    }
    public double getSisi(){
        return sisi;
    }
    public double menghitungKeliling(){
        double keliling = 4*sisi;
        return keliling;
    }
    public double menghitungLuas(){
        double luas = sisi*sisi;
        return luas;
    }
}
