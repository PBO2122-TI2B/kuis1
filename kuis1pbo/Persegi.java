package Kuis1;

public class Persegi {
        private int sisi;

        public void setSisi(int sisi){
            this.sisi = sisi;
        }
        public int getSisi(){
            return sisi;
        }
        public int hitungLuas(){
            return sisi*sisi;
        }
        public int hitungKeliling() {
            return sisi * 4;
        }
}
