public class QuizNomor1 {
    private double a, b, c, r, alas, tinggi;
    private int s , p, l ;

    // Nomor 1 Segitiga
    public void setNilaiA(int newA){
        this.a = newA;
    }

    public void setNilaiB(int newB){
        this.b = newB;
    }

    public void setNilaiC(int newC){
        this.c = newC;
    }

    public double getLuasSegitiga(){
        return 0.5 * (this.a + this.b);
    }

    public double getKelilingSegitiga(){
        return this.a + this.b + this.c;
    }

    //Nomor 2 Persegi
    public void setNilaiSisi(int newSisi){
        this.s = newSisi;
    }

    public int getLuasPersegi(){
        return this.s * this.s;
    }

    public int getKelilingPersegi(){
        return 4 * s;
    }

    //Nomor 3 Persegi Panjang
    public void setNilaiPanjang(int newP){
        this.p = newP;
    }

    public void setNilaiLebar(int newL){
        this.l = newL;
    }

    public int getLuasPersegiPanjang(){
        return p * l;
    }

    public int getKelilingPersegiPanjang(){
        return 2 * (p + l);
    }

    //Nomor 4 Lingkaran
    public void setNilaiJari(double newR){
        this.r = newR;
    }

    public double getLuasLingkaran(){
        return 3.14 * r * r;
    }

    public double getKelilingLingkaran(){
        return 2 * 3.14 * r;
    }

    //Nomor 5 Jajar Genjang
    public void setNilaiAlas(int newAlas){
        this.alas = newAlas;
    }

    public void setNilaiTinggi(int newTinggi){
        this.tinggi = newTinggi;
    }

    public double getLuasJajarGenjang(){
        return (int) alas * tinggi;
    }

    public double getSisiMiring(){
        return  Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
    public double getKelilingJajarGenjang(){
        return 2 * (alas + getSisiMiring());
    }

}

//Adika Ahmad Hanif Nazhir