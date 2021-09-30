package Kuis1.Nomer1;

public class Lingkaran {
    private int luas,keliling;
    double phi = 3.14;

    public void setHitungLuas(int r){
        luas = (int) (phi * r * r);
    }
    public void setHitungKeliling(int r){
        keliling = (int) (2*phi * r );
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
}
