package Kuis1;

public class PersegiPanjang {
    private int panjang, lebar;

    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int hitungLuas(){
        return panjang * lebar;
    }
    public int hitungKeliling(){
        return  2 * (panjang + lebar);
    }
}
