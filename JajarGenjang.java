package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
public class JajarGenjang {
    private final double alas;
    private final double tinggi;
    private final double sisiMiring;
    JajarGenjang (double a, double t, double m){ 
        this.alas = a; 
        this.tinggi = t; 
        this.sisiMiring = m;
    }
    public double getAlas (){ 
        return alas; 
    } 
    public double getTinggi (){ 
        return tinggi; 
    }
    public double getSisiMiring (){ 
        return sisiMiring; 
    }
    public double hitungLuas () { 
        double luas = alas * tinggi; 
        return luas; 
    }
    public double hitungKeliling () { 
        double kll = (alas + sisiMiring) * 2; 
        return kll;
    }
}
