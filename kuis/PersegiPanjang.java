package kuis;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public void setValue(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        double luas = this.panjang * this.lebar;
        return luas;
    }

    public double getKeliling() {
        double keliling = (2 * this.panjang) + (2 * this.lebar);
        return keliling;
    }
}
