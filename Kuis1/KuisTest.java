package Kuis1;
import Kuis1.Nomer1.*;
import java.util.Scanner;

public class KuisTest {
    public static void main(String[] args) {
        Segitiga sgtg = new Segitiga();
        Persegi prsg = new Persegi();
        PersegiPanjang prsgpnjg = new PersegiPanjang();
        Lingkaran lkrg = new Lingkaran();
        JajarGenjang jajargnj = new JajarGenjang();

        Scanner userInput = new Scanner(System.in);

        char pilih;
        int pilihan;
        do {
            String Menu = "====================================\n"
                    + "============ Pilih Opsi ============\n"
                    + "===================================="
                    + "\n1.Segitiga "
                    + "\n2.Persegi "
                    + "\n3.Persegi Panjang"
                    + "\n4.Lingkaran "
                    + "\n5.Jajar Genjang "
                    + "\n0.Keluar";

            System.out.println(Menu);

            System.out.print("Pilih menu berdasarkan nomer >> ");
            pilihan = userInput.nextInt();

            System.out.println();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("=== Hitung Luas ===");
                    System.out.print("Masukkan alas:  " );
                    int alas = userInput.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = userInput.nextInt();
                    sgtg.setHitungLuas(alas,tinggi);
                    System.out.println("Luas: " + sgtg.getLuas());
                    System.out.println("=== Hitung Keliling ===");
                    System.out.print("Masukkan sisi: ");
                    int sisi = userInput.nextInt();
                    sgtg.setHitungKeliling(sisi);
                    System.out.println("Keliling: " + sgtg.getKeliling());
                }
                case 2 -> {
                    System.out.print("Masukkan sisi: " );
                    int sisi = userInput.nextInt();
                    prsg.setHitungLuas(sisi);
                    System.out.print("Luas: " + prsg.getLuas() + "\n");
                    prsg.setHitungKeliling(sisi);
                    System.out.println("Keliling: " + prsg.getKeliling());
                }
                case 3 -> {
                    System.out.print("Masukkan Panjang : " );
                    int panjang = userInput.nextInt();
                    System.out.print("Masukkan Lebar : " );
                    int lebar = userInput.nextInt();
                    prsgpnjg.setHitungLuas(panjang,lebar);
                    System.out.print("Luas: " + prsgpnjg.getLuas() + "\n");
                    prsgpnjg.setHitungKeliling(panjang,lebar);
                    System.out.println("Keliling: " + prsgpnjg.getKeliling());
                }
                case 4 -> {
                    System.out.print("Masukkan Panjang jari - jari: " );
                    int jari = userInput.nextInt();
                    lkrg.setHitungLuas(jari);
                    System.out.print("Luas: " + lkrg.getLuas() + "\n");
                    lkrg.setHitungKeliling(jari);
                    System.out.println("Keliling: " + lkrg.getKeliling());
                }
                case 5 -> {
                    System.out.print("Masukkan alas : " );
                    int alas = userInput.nextInt();
                    System.out.print("Masukkan tinggi : " );
                    int tinggi = userInput.nextInt();
                    jajargnj.setHitungLuas(alas,tinggi);
                    System.out.print("Luas: " + jajargnj.getLuas() + "\n");
                    System.out.println("Masukkan sisi miring : ");
                    int sisiMiring = userInput.nextInt();
                    jajargnj.setHitungKeliling(alas,sisiMiring);
                    System.out.println("Keliling: " + jajargnj.getKeliling());
                }
                case 0 -> {
                    System.out.println("\t\t\t     === Terima Kasih === \n");
                    System.exit(0);
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }

        }while (!(pilihan == 0));
    }
}
