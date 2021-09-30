import static java.lang.Math.sqrt;
public class Segitiga {
    public double alas,tinggi,sisiMiring;
    public double luas,keliling;

    public void setAlas(double alas){
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double hitungLuas() {
        luas = 0.5 * alas * tinggi ;
        return luas;
    }

    public double hitungKeliling() {
        sisiMiring = sqrt((alas * alas) + (tinggi * tinggi));
        keliling = alas + tinggi + sisiMiring;
        return keliling;
    }
}
