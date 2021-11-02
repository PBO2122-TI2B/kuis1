package kuis;

public class Persegi {
    private double sisi;

    public void setValue(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        double luas = this.sisi * this.sisi;
        return luas;
    }

    public double getKeliling() {
        double keliling = 4 * this.sisi;
        return keliling;
    }
}
