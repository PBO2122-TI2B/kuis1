import java.util.*;

public class Nomor1Demo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
            int menu;
            do{
                System.out.println("---------------------------------");
                System.out.println("------- Menu Bangun Datar -------");
                System.out.println("---------------------------------");
                System.out.println("1. Segitiga");
                System.out.println("2. Persegi");
                System.out.println("3. Persegi Panjang");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Keluar");

                System.out.print("Menu : ");
                menu = sc.nextInt();

                if (menu == 1) {
                    QuizNomor1 segitiga = new QuizNomor1();
                    System.out.println("===== Segitiga =====");
                    System.out.println("====================");
                    System.out.print("Nilai A : ");
                    segitiga.setNilaiA(sc.nextInt());
                    System.out.print("Nilai B : ");
                    segitiga.setNilaiB(sc.nextInt());
                    System.out.print("Nilai C : ");
                    segitiga.setNilaiC(sc.nextInt());
                    System.out.println("-----------------------------");
                    System.out.println("Luas Segitiga       : " +segitiga.getLuasSegitiga());
                    System.out.println("Keliling Segitiga   : " +segitiga.getKelilingSegitiga());

                } else if (menu == 2) {
                    QuizNomor1 persegi = new QuizNomor1();
                    System.out.println("==== Persegi =====");
                    System.out.println("==================");
                    System.out.print("Nilai Sisi : ");
                    persegi.setNilaiSisi(sc.nextInt());
                    System.out.println("-----------------------------");
                    System.out.println("Luas Persegi       : " +persegi.getLuasPersegi());
                    System.out.println("Keliling Persegi   : " +persegi.getKelilingPersegi());

                } else if (menu == 3) {
                    QuizNomor1 persegiPanjang = new QuizNomor1();
                    System.out.println("==== Persegi Panjang =====");
                    System.out.println("==========================");
                    System.out.print("Nilai Panjang : ");
                    persegiPanjang.setNilaiPanjang(sc.nextInt());
                    System.out.print("Nilai Lebar : ");
                    persegiPanjang.setNilaiLebar(sc.nextInt());
                    System.out.println("---------------------------------");
                    System.out.println("Luas Persegi Panjang       : " +persegiPanjang.getLuasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang   : " +persegiPanjang.getKelilingPersegiPanjang());
                    
                } else if (menu == 4) {
                    QuizNomor1 lingkaran = new QuizNomor1();
                    System.out.println("==== Lingkaran =====");
                    System.out.println("====================");
                    System.out.print("Nilai Jari-jari : ");
                    lingkaran.setNilaiJari(sc.nextInt());
                    System.out.println("---------------------------------");
                    System.out.println("Luas Lingkaran       : " +lingkaran.getLuasLingkaran());
                    System.out.println("Keliling Lingkaran   : " +lingkaran.getKelilingLingkaran());

                } else if (menu == 5) {
                    QuizNomor1 jajarGenjang = new QuizNomor1();
                    System.out.println("==== Jajar Genjang =====");
                    System.out.println("========================");
                    System.out.print("Nilai Alas : ");
                    jajarGenjang.setNilaiAlas(sc.nextInt());
                    System.out.print("Nilai Tinggi :");
                    jajarGenjang.setNilaiTinggi(sc.nextInt());
                    System.out.println("---------------------------------");
                    System.out.println("Luas Jajar Genjang       : " +jajarGenjang.getLuasJajarGenjang());
                    System.out.println("Sisi Miring Jajar Genjang : " +jajarGenjang.getSisiMiring());
                    System.out.println("Keliling Jajar Genjang   : " +jajarGenjang.getKelilingJajarGenjang());
        
                } else if (menu == 6) {
                    System.out.println("Anda Keluar dari Pemrograman Bangun Datar");
                } 
            }while (menu != 6);

        sc.close();
    }
}

//Adika Ahmad Hanif Nazhir