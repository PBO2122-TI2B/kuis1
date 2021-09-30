public class KuisLingkaran {
    private float r;

    public float getJariJari() {
        return r;
    }
    public void setJariJari(float r) {
        this.r = r;
    }

    public double getLuasLingkaran() {
        double luasLingkaran;
        luasLingkaran = 3.14*r*r;
        return luasLingkaran;
    }
    public double getKelilingLingkaran() {
    double KelilingLingkaran;
    KelilingLingkaran = 2*3.14*r;
    return KelilingLingkaran;
}
}