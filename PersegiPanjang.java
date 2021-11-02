package Kuis1;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class PersegiPanjang {
    //declaration attribute
    private int panjang;
    private int lebar;
    //constructor
    PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //declaration method
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int newPanjang){
        panjang = newPanjang;
    }
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int newLebar){
        lebar = newLebar;
    }
    public int hitungLuas(int panjang, int lebar)
    {
        int luas = panjang * lebar;
        return luas;
    }
    public int hitungKeliling(int panjang, int lebar)
    {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
