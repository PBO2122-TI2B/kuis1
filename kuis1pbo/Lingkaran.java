package Kuis1;

public class Lingkaran {
        private double phi;
        private double r;

        public void setPhi(double phi){
            this.phi = phi;
        }
        public double getPhi(){
            return phi;
        }
        public void setR(double r){
            this.r = r;
        }
        public double getR(){
            return r;
        }
        public double hitungLuas(){
            double luas = phi * (r*r);
            return luas;
        }
        public double hitungKeliling(){
            double keliling = 2 * phi * r;
            return keliling;
        }
}

