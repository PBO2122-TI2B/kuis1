import java.util.Scanner;

public class MainKuisLingkaran{
    public static void main (String[] args) {

        KuisLingkaran li = new KuisLingkaran();
        Scanner input = new Scanner (System.in);
        System.out.print ("Masukkan nilai jari-jari: ");
        float r = input.nextFloat();

        li.setJariJari(r);

        System.out.println ();
        System.out.println ("Nilai Jari-Jari= "+li.getJariJari());
        System.out.println ();
        System.out.println ("Nilai luas lingkaran adalah= "+ li.getLuasLingkaran());
        System.out.println ("Nilai Keliling Lingkaran adalah= " +li.getKelilingLingkaran());
        System.out.println ("==========================================");


    }      
        
}