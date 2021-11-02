package kuis;

public class Lingkaran {
    public double phi = 3.14;
    private double r;

    public void setValue(double r) {
        this.r = r;
    }

    public double getLuas() {
        double luas = phi * this.r * this.r;
        return luas;
    }

    public double getKeliling() {
        double keliling = 2 * phi * this.r;
        return keliling;
    }
}
