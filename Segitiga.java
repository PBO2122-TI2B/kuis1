package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
public class Segitiga {
    private final double alas;
    private final double tinggi;
    Segitiga (double a, double t){ 
        this.alas = a; 
        this.tinggi = t; 
    }
    public double getAlas (){ 
        return alas; 
    } 
    public double getTinggi (){ 
        return tinggi; 
    }
    public double hitungSisiMiring () { 
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi)); 
        return sisiMiring; 
    }
    public double hitungLuas () { 
        double luas = alas * tinggi * 0.5; 
        return luas; 
    }
    public double hitungKeliling () { 
        double kll = alas + tinggi + hitungSisiMiring (); 
        return kll; 
    }
}
