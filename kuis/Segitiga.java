package BangungDatar;
public class Segitiga {
    private float sisiA;
    private float sisiB;
    private float sisiC= 13;
    public void setsisiA(float sisA){
        sisiA = sisA;
    }
    public void setSisiB(float sisB){
        sisiB = sisB;
    }
    public void setSisiC(float sisC){
        sisiC = sisC;
    }
    public double getSisiA(){
        return sisiA;
    }
    public double getSisiB(){
        return sisiB;
    }
    public double getSisiC(){
        return sisiC;
    }
    public float menghitungKeliling(){
        float keliling = sisiA+sisiB+sisiC;
        return keliling;
    }
    public float menghitungLuas(){
        float luas = (sisiA+sisiB)*1/2;
        return luas;
    }
}
