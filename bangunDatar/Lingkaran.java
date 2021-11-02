package bangunDatar;

public class Lingkaran {
    private double phi = 3.14;
    private double r;

    public void setJari(double r) {
        this.r = r;
    }
    public double getJari() {
        return r;
    }
    public double hitungLuasLing() {
        double luas = phi*r*r;
        return luas;
    }
    public double hitungKelLing() {
        double keliling = 2*phi*r;
        return keliling;
    }
    
}
