package AkhmadRamadani;

public class PersegiPanjang {
    private float panjang, lebar;

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float hitungLuas() {
        float result = panjang * lebar;

        return result;
    }

    public float hitungKeliling() {
        float result = 2 * (panjang + lebar);

        return result;
    }
}
