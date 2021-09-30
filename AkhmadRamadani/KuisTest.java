package AkhmadRamadani;

import java.util.Scanner;

public class KuisTest {

    public static void showMenu() {
        System.out.println("********* Bangun Datar *********");
        System.out.println("Sila pilih bangun datar");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Keluar");
    }

    public static void showMenuPenghitungan() {
        System.out.println("Ingin menghitung apa?");
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.println("Pilih angka lain untuk membatalkan");
    }

    public static void hitungLuas(int menu) {
        Scanner scanner = new Scanner(System.in);
        switch (menu) {
            case 1:
                System.out.print("Masukkan sisi: ");
                float sisi = scanner.nextFloat();
                Persegi persegi = new Persegi();
                persegi.setSisi(sisi);
                System.out.println("Luas persegi: " + persegi.hitungLuas());

                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                float panjang = scanner.nextFloat();
                System.out.print("Masukkan lebar: ");
                float lebar = scanner.nextFloat();
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                persegiPanjang.setPanjang(panjang);
                persegiPanjang.setLebar(lebar);
                System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());

                break;

            case 3:
                System.out.print("Masukkan alas: ");
                float alas = scanner.nextFloat();
                System.out.print("Masukkan tinggi: ");
                float tinggi = scanner.nextFloat();
                Segitiga segitiga = new Segitiga();
                segitiga.setAlas(alas);
                segitiga.setTinggi(tinggi);
                double sisiMiring = segitiga.hitungSisiMiring();
                segitiga.setSisiMiring(sisiMiring);
                System.out.println("Luas segitiga: " + segitiga.hitungLuas());

                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                float jariJari = scanner.nextFloat();
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.setJariJari(jariJari);
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());

                break;

            case 5:
                System.out.print("Masukkan alas: ");
                float alasJG = scanner.nextFloat();
                System.out.print("Masukkan tinggi: ");
                float tinggiJG = scanner.nextFloat();
                JajarGenjang jajarGenjang = new JajarGenjang();
                jajarGenjang.setAlas(alasJG);
                jajarGenjang.setTinggi(tinggiJG);
                System.out.println("Luas Jajar Genjang: " + jajarGenjang.hitungLuas());

                break;
            default:
                break;
        }
    }

    public static void hitungKeliling(int menu) {
        Scanner scanner = new Scanner(System.in);
        switch (menu) {
            case 1:
                System.out.print("Masukkan sisi: ");
                float sisi = scanner.nextFloat();
                Persegi persegi = new Persegi();
                persegi.setSisi(sisi);
                System.out.println("Keliling persegi: " + persegi.hitungKeliling());

                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                float panjang = scanner.nextFloat();
                System.out.print("Masukkan lebar: ");
                float lebar = scanner.nextFloat();
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                persegiPanjang.setPanjang(panjang);
                persegiPanjang.setLebar(lebar);
                System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());

                break;

            case 3:
                System.out.print("Masukkan alas: ");
                float alas = scanner.nextFloat();
                System.out.print("Masukkan tinggi: ");
                float tinggi = scanner.nextFloat();
                Segitiga segitiga = new Segitiga();
                segitiga.setAlas(alas);
                segitiga.setTinggi(tinggi);
                double sisiMiring = segitiga.hitungSisiMiring();
                segitiga.setSisiMiring(sisiMiring);
                System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());

                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                float jariJari = scanner.nextFloat();
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.setJariJari(jariJari);
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());

                break;

            case 5:
                System.out.print("Masukkan alas: ");
                float alasJG = scanner.nextFloat();
                System.out.print("Masukkan sisi miring: ");
                float sisiMiringJG = scanner.nextFloat();
                JajarGenjang jajarGenjang = new JajarGenjang();
                jajarGenjang.setAlas(alasJG);
                jajarGenjang.setSisiMiring(sisiMiringJG);
                System.out.println("Keliling jajar genjang: " + jajarGenjang.hitungKeliling());

                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        boolean isExit = false;
        do {
            System.out.println();
            showMenu();
            System.out.print("Pilih: ");
            menu = scanner.nextInt();
            int menuHitung = 0;

            switch (menu) {
                case 1:
                    System.out.println("\nPersegi\n");
                    showMenuPenghitungan();
                    System.out.print("Pilih: ");
                    menuHitung = scanner.nextInt();
                    switch (menuHitung) {
                        case 1:
                            hitungLuas(1);
                            break;
                        case 2:
                            hitungKeliling(1);
                            break;

                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nPersegi Panjang\n");
                    showMenuPenghitungan();
                    System.out.print("Pilih: ");
                    menuHitung = scanner.nextInt();
                    switch (menuHitung) {
                        case 1:
                            hitungLuas(2);
                            break;
                        case 2:
                            hitungKeliling(2);
                            break;

                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nSegitiga\n");
                    showMenuPenghitungan();
                    System.out.print("Pilih: ");
                    menuHitung = scanner.nextInt();
                    switch (menuHitung) {
                        case 1:
                            hitungLuas(3);
                            break;
                        case 2:
                            hitungKeliling(3);
                            break;

                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\nLingkaran\n");
                    showMenuPenghitungan();
                    System.out.print("Pilih: ");
                    menuHitung = scanner.nextInt();
                    switch (menuHitung) {
                        case 1:
                            hitungLuas(4);
                            break;
                        case 2:
                            hitungKeliling(4);
                            break;

                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\nJajar Genjang\n");
                    showMenuPenghitungan();
                    System.out.print("Pilih: ");
                    menuHitung = scanner.nextInt();
                    switch (menuHitung) {
                        case 1:
                            hitungLuas(5);
                            break;
                        case 2:
                            hitungKeliling(5);
                            break;

                        default:
                            break;
                    }
                    break;
                case 6:
                    isExit = true;
                    break;

                default:
                    break;
            }
        } while (!isExit);
    }
}
