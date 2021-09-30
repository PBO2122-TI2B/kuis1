package AkhmadRamadani;

public class JajarGenjang {
    private float alas, tinggi, sisiMiring;

    public float getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(float sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float hitungLuas() {
        float result = alas * tinggi;

        return result;
    }

    public float hitungKeliling() {
        float result = 2 * (alas + sisiMiring);

        return result;
    }

}
