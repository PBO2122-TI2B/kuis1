import java.util.*;
public class MainPersegiKuis {
    public static void main(String[] args) {

persegiKuis ps = new persegiKuis();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai sisi   :");
float sisi=input.nextFloat();

ps.setSisi(sisi);



System.out.println();

System.out.println("Nilai Sisi = "+ps.getSisi());



System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas persegi Adalah = "+ps.getLuaspersegi());
System.out.println("Nilai Luas persegi Adalah = "+ps.getKelilingPersegi());

}
    
}