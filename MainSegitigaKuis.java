import java.util.*;
public class MainSegitigaKuis {
    public static void main(String[] args) {

SegitigaKuis S= new SegitigaKuis();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Alas   :");
float alas=input.nextFloat();

System.out.print("Masukkan Nilai Tinggi :");
float tinggi=input.nextFloat();
System.out.print("Masukkan Nilai Miring :");
float miring=input.nextFloat();

S.setAlas(alas);

S.setTinggi(tinggi);
S.setMiring(miring);


System.out.println();

System.out.println("Nilai Alas = "+S.getAlas());

System.out.println("Nilai Tinggi  = "+S.getTinggi());
System.out.println("Nilai Miring  = "+S.getMiring());

System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas Segitiga Adalah = "+S.getLuasSegitiga());
System.out.println("Nilai Luas Segitiga Adalah = "+S.getKelilingSegitiga());

}
    
}