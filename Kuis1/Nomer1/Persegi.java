package Kuis1.Nomer1;

public class Persegi {
    private int luas,keliling;

    public void setHitungLuas(int sisi){
        luas = sisi*sisi;
    }
    public void setHitungKeliling(int sisi){
        keliling = 4*sisi;
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
}
