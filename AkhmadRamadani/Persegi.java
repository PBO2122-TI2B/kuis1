package AkhmadRamadani;

public class Persegi {
    private float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float hitungLuas() {
        float result = sisi * sisi;

        return result;
    }

    public float hitungKeliling() {
        float result = 4 * sisi;

        return result;
    }
}
