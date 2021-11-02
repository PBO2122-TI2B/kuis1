package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
public class Persegi {
    private double sisi;
    public void setSisi (double s){ 
        this.sisi = s; 
    }
    public double getSisi (){ 
        return sisi; 
    }
    public double hitungLuas () { 
        double luas = sisi * sisi; 
        return luas; 
    }
    public double hitungKeliling () { 
        double kll = 4 * sisi; 
        return kll; 
    }
}
