public class JajarGenjang {
    public double alas,tinggi,sisiMiring;
    public double luas,keliling;

    public void setAlas(double alas){
        this.alas=alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getSisiMiring(){
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring){
        this.sisiMiring=sisiMiring;
    }

    public double hitungLuas() {
        luas = alas * tinggi;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 * (alas+sisiMiring);
        return keliling;
    }
}
