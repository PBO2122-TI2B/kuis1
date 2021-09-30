public class Lingkaran {
    public double phi;
    public double r;
    public double luas, keliling;

    public void setR(double r){
        this.r = r ;
    }
    
    public void setPhi(double phi){
        this.phi = phi;
    }

    public double getR(){
        return r;
    }

    public double getPhi(){
        return phi;
    }

    public double hitungLuas() {
        luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling() {
        keliling = phi * r * 2;
        return keliling;
    }

}