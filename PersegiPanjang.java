package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
public class PersegiPanjang {
    private final double panjang;
    private final double lebar;
    PersegiPanjang (double p, double l){ 
        this.panjang = p; 
        this.lebar = l; 
    }
    public double getPanjang (){ 
        return panjang; 
    } 
    public double getLebar (){ 
        return lebar; 
    }
    public double hitungLuas () { 
        double luas = panjang * lebar; 
        return luas; 
    }
    public double hitungKeliling () { 
        double kll = (panjang + lebar) * 2; 
        return kll; 
    }
}
