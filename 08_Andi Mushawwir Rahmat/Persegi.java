public class Persegi {
    private double sisi;
    private double luas;
    private double keliling;

    public void setSisi(int s) {
        if (s > 0) {
            this.sisi = s;
        } else {
            this.sisi = 0;
        }
    }

    public double getLuas() {
        this.luas = sisi * sisi;
        return this.luas;
    }

    public double getKeliling() {
        this.keliling = 4 * sisi;
        return this.keliling;
    }
}
