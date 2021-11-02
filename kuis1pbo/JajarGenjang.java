package Kuis1;

public class JajarGenjang {
    private int alas, tinggi, sisiMiring;

    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void setSisiMiring(int sisiMiring){
        this.sisiMiring = sisiMiring;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int getSisiMiring(){
        return sisiMiring;
    }
    public int hitungLuas(){
        return alas * tinggi;
    }
    public int hitungKel(){
        return  2 * (alas + sisiMiring);
    }
}
