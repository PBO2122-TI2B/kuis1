public class PersegiPanjang {
    public double panjang,lebar;
    public double luas,keliling;

    public void setPanjang(double panjang){
        this.panjang=panjang;
    }

    public void setLebar(double lebar){
        this.lebar=lebar;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 * (panjang+lebar);
        return keliling;
    }
}
