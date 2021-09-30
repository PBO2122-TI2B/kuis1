import static java.lang.Math.sqrt;

public class BangunDatar {
    private int tinggiSegitiga, alasSegitiga, panjangPersegiP, lebarPersegiP, sisiPersegi, tinggiJG, alasJG;
    private double sisiMiringS, sisiMiringJG, jariLingkaran, lSegitiga, lLingkaran, kLingkaran, kJG, kSegitiga;
    private int lPersegi, lPersegiP, lJG, kPersegi, kPersegiP;

    // Set Segitiga
    public void setSegitiga(int ts, int as) {
        tinggiSegitiga = ts;
        alasSegitiga = as;
        sisiMiringS = sqrt((alasSegitiga * alasSegitiga) + (tinggiSegitiga * tinggiSegitiga));

        lSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        kSegitiga = sisiMiringS + alasSegitiga + tinggiSegitiga;
    }

    // Set Persegi
    public void setPersegi(int ss) {
        sisiPersegi = ss;

        lPersegi = sisiPersegi * sisiPersegi;
        kPersegi = 4 * sisiPersegi;
    }

    // Set Persegi Panjang
    public void setPersegiPanjang(int p, int l) {
        panjangPersegiP = p;
        lebarPersegiP = l;

        lPersegiP = panjangPersegiP * lebarPersegiP;
        kPersegiP = 2 * (panjangPersegiP + lebarPersegiP);
    }

    // Set Lingkaran
    public void setLingkaran(int jari) {
        jariLingkaran = jari;

        lLingkaran = 3.14 * jariLingkaran * jariLingkaran;
        kLingkaran = 2 * 3.14 * jariLingkaran;
    }

    // Set Jajar Genjang
    public void setJajarGenjang(int tj, int aj, int smj) {
        tinggiJG = tj;
        alasJG = aj;
        sisiMiringJG = smj;

        lJG = alasJG * tinggiJG;
        kJG = 2 * alasJG * sisiMiringJG;
    }

    // ----------------------------------------------------------------------

    // Get Segitiga
    public double getLSegitiga() {
        return lSegitiga;
    }

    public double getKSegitiga() {
        return kSegitiga;
    }

    // Get Persegi
    public int getLPersegi() {
        return lPersegi;
    }

    public int getKPersegi() {
        return kPersegi;
    }

    // Get Persegi Panjang
    public int getLPersegiP() {
        return lPersegiP;
    }

    public int getKPersegiP() {
        return kPersegiP;
    }

    // Get Lingkaran
    public double getLLingkaran() {
        return lLingkaran;
    }

    public double getKLingkaran() {
        return kLingkaran;
    }

    // Get Jajar Genjang
    public int getLJG() {
        return lJG;
    }

    public double getKJG() {
        return kJG;
    }
}
