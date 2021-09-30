package Kuis1.Nomer1;

public class Segitiga {
    private int luas,keliling;

    public void setHitungLuas(int alas, int tinggi){
        luas = alas*tinggi/2;
    }
    public void setHitungKeliling(int sisi1){
        keliling = sisi1*3;
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
}
