package AkhmadRamadani;

public class Lingkaran {
    private float jariJari;

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float hitungLuas() {
        float result = 3.14f * jariJari * jariJari;

        return result;
    }

    public float hitungKeliling() {
        float result = 2 * 3.14f * jariJari;

        return result;
    }
}
