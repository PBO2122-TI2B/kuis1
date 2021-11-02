package kuis;

public class JajarGenjang {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public void setValue(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getLuas() {
        double luas = this.alas * this.tinggi;
        return luas;
    }

    public double getKeliling() {
        double keliling = 2 * (this.alas + this.sisiMiring);
        return keliling;
    }
}
