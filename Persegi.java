package Kuis1;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class Persegi {
    //declaration attribute
    private int sisi;
    
    //constructor
    Persegi(int sisi){
        this.sisi = sisi;
    }
    //declaration method
    public int getSisi(){
        return sisi;
    }
    public void setTinggi(int newSisi){
        sisi = newSisi;
    }
    public int hitungLuas(int s)
    {
        int luas = s * s;
        return luas;
    }
    public int hitungKeliling(int s)
    {
        int keliling = 4 * s;
        return keliling;
    }
}
