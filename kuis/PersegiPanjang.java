package BangungDatar;
public class PersegiPanjang {
    private double panjang;
    private double lebar;
    public void setPanjang(double p){
        panjang = p;
    }
    public void setLebar(double l){
        lebar = l;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double menghitungKeliling(){
        double keliling = 2*(panjang+lebar);
        return keliling;
    }
    public double menghitungLuas(){
        double luas = panjang*lebar;
        return luas;
    }
    
}
