package bangunDatar;

public class Segitiga {
    private int sisiA;
    private int sisiB;
    private int sisiC;

    public void setSisiA(int sisiA) {
        this.sisiA = sisiA;
    }
    public void setSisiB(int sisiB) {
        this.sisiB = sisiB;
    }
    public void setSisiC(int sisiC) {
        this.sisiC = sisiC;
    }
    public int getSisiA(){
        return sisiA;
    }
    public int getSisiB(){
        return sisiB;
    }
    public int getSisiC(){
        return sisiC;
    }
    public double hitungTinggiSg() {
        double tinggi = Math.sqrt(Math.pow(sisiB, 2) - Math.pow(sisiA, 2));
        return tinggi;
    }
    public double hitungKelSg(){
        double keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double hitungLuasSg(){
        double luas = 0.5 * sisiA * hitungTinggiSg();
        return luas;
    }
}