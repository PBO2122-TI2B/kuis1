package Kuis1.Nomer1;

public class JajarGenjang {
    private int luas,keliling;

    public void setHitungLuas(int alas, int tinggi){
        luas = alas*tinggi;
    }
    public void setHitungKeliling(int alas, int sisiMiring){
        keliling = 2 * (alas+sisiMiring);
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
}
