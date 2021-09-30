package AkhmadRamadani;

public class Segitiga {
    private double alas, tinggi, sisiMiring;

    public double getAlas() {
        return alas;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double hitungLuas() {
        double result = (alas * tinggi) / 2;

        return result;
    }

    public double hitungKeliling() {
        double result = alas + tinggi + sisiMiring;

        return result;
    }

    public double hitungSisiMiring() {
        double result = Math.sqrt((alas * alas) + (tinggi * tinggi));

        return result;
    }
}
