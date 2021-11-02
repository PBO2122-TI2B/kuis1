package bangunDatar;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int getLebar(){
        return lebar;
    }
    public int hitungKelPsgPjg(){
        int keliling = 2*(panjang + lebar);
        return keliling;
    }
    public int hitungLuasPsgPjg(){
        int luas = panjang * lebar;
        return luas;
    }
}
