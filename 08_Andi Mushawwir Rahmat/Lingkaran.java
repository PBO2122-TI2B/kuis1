public class Lingkaran {

    private int jejari;
    private double luas;
    private double keliling;

    public void setJejari(int r) {
        if (r > 0) {
            this.jejari = r;
        } else {
            this.jejari = 0;
        }
    }

    public double getLuas() {
        this.luas = 3.14 * (2 * this.jejari);
        return this.luas;
    }

    public double getKeliling() {
        this.keliling = 2 * 3.14 * this.jejari;
        return this.keliling;
    }
}