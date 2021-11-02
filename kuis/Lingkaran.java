package BangungDatar;
public class Lingkaran {
    private double jariJari;
    public void setJariJari(double r){
        jariJari = r;
    }
    public double getJariJari(){
        return jariJari;
    }
    public double menghitungKeliling(){
        double keliling = 2*3.14*jariJari;
        return keliling;
    }
    public double menghitungLuas(){
        double luas = 3.14*jariJari*jariJari;
        return luas;
    }
}
