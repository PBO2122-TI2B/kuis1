import java.util.*;
public class Mainjajargenjang {
        public static void main(String[] args) {

jajargenjang j = new jajargenjang();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Alas  :");
float alas=input.nextFloat();
System.out.print("Masukkan Nilai Tinggi  :");
float Tinggi=input.nextFloat();
System.out.print("Masukkan Nilai Miring  :");
float Miring=input.nextFloat();


j.setAlas(alas);     
j.setTinggi(Tinggi);
j.setMiring(Miring);


System.out.println();

System.out.println("Nilai Alas = "+j.getalas());
System.out.println("Nilai Tinggi = "+j.getTinggi());
System.out.println("Nilai Miring = "+j.getMiring());




System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas persegi panjang Adalah = "+j.getLuasJajargenjang());
System.out.println("Nilai Keliling persegi panjang Adalah = "+j.getKelilingJajargenjang());

}
}