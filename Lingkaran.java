package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
public class Lingkaran {
    private double phi = 3.14;
    private double r;
    public void setR (double r){ 
        this.r = r; 
    }
    public double getR (){ 
        return r; 
    } 
    public double hitungLuas () { 
        double luas = phi * r * r; 
        return luas; 
    }
    public double hitungKeliling () { 
        double kll = phi * r * 2; 
        return kll; 
    }
}
