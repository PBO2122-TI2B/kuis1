public class Persegi {
    public double sisi;
    public double luas,keliling;

    public void setSisi(double sisi){
        this.sisi=sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }
}
