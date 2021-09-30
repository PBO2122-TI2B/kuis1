package Kuis1.Nomer1;

public class PersegiPanjang {
    private int luas,keliling;

    public void setHitungLuas(int panjang, int lebar){
        luas = panjang*lebar;
    }
    public void setHitungKeliling(int panjang, int lebar){
        keliling = 2*(panjang*lebar);
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
}
