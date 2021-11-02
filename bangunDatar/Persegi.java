package bangunDatar;

public class Persegi {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int getSisi() {
        return sisi;
    }
    public int hitungKelPsg(){
        int keliling = 4*sisi;
        return keliling;
    }
    public int hitungLuasPsg(){
        int luas = sisi * sisi;
        return luas;
    }
}