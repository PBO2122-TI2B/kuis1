package bangunDatar;

public class JajarGenjang {
    private int sisiAlas;
    private int sisiMiring;
    private int tinggi;

    public void setSisiAlas(int sisiAlas) {
        this.sisiAlas = sisiAlas;
    }
    public void setSisiMiring(int sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getSisiAlas(){
        return sisiAlas;
    }
    public int getSisiMiring(){
        return sisiMiring;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int hitungKelJg(){
        int keliling = 2*(sisiAlas+sisiMiring);
        return keliling;
    }
    public int hitungLuasJg() {
        int luas = sisiAlas * tinggi;
        return luas;
    }
}
