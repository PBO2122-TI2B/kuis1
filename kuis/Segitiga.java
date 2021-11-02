package kuis;

public class Segitiga {
    private double alas;
    private double tinggi;

    public void setValue(double a, double b) {
        this.alas = a;
        this.tinggi = b;
    }

    public double getSisiMiring(){
        double sisiMiring = Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return sisiMiring;
    }

    public double getLuas() {
        double luas = 0.5 * (this.alas * this.tinggi);
        return luas;
    }

    public double getKeliling() {
        double keliling = this.alas + 2 * getSisiMiring();
        return keliling;
    }
}
