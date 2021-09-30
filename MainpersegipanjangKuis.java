import java.util.*;
public class MainpersegipanjangKuis {
    public static void main(String[] args) {

persegipanjangKuis pp = new persegipanjangKuis();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Panjang  :");
float panjang=input.nextFloat();
System.out.print("Masukkan Nilai Lebar  :");
float lebar=input.nextFloat();

pp.setPanjang(panjang);
pp.setLebar(lebar);

System.out.println();

System.out.println("Nilai Panjang = "+pp.getPanjang());
System.out.println("Nilai Lebar = "+pp.getLebar());

System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas persegi panjang Adalah = "+pp.getLuaspersegipanjang());
System.out.println("Nilai Keliling persegi panjang Adalah = "+pp.getKelilingPersegipanjang());

}
    
}