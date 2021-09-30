import java.util.Scanner;

public class KuisTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BangunDatar bg = new BangunDatar();
        System.out.println("\n-- SELAMAT DATANG DI PERHITUNGAN BANGUN DATAR --");

        int choice;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu Bangun Datar\n");
            System.out.print("1.) Segitiga \n");
            System.out.print("2.) Persegi \n");
            System.out.print("3.) Persegi Panjang \n");
            System.out.print("4.) Lingkaran\n");
            System.out.print("5.) Jajar Genjang\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nMasukkan Menu Pilihan : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int tinggi, alas;
                    System.out.println("------------------ SEGITIGA ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Segitiga");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Alas        : ");
                    alas = sc.nextInt();
                    System.out.print("Set Tinggi      : ");
                    tinggi = sc.nextInt();
                    bg.setSegitiga(tinggi, alas);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Luas Segitiga     : " + bg.getLSegitiga());
                    System.out.println("Keliling Segitiga : " + bg.getKSegitiga());
                    break;

                case 2:
                    int sisi;
                    System.out.println("------------------ PERSEGI ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Persegi");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Sisi Persegi : ");
                    sisi = sc.nextInt();
                    bg.setPersegi(sisi);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Luas Persegi     : " + bg.getLPersegi());
                    System.out.println("Keliling Persegi : " + bg.getKPersegi());
                    break;

                case 3:
                    int panjang, lebar;
                    System.out.println("------------------ PERSEGI PANJANG ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Persegi Panjang");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Panjang : ");
                    panjang = sc.nextInt();
                    System.out.print("Set Lebar : ");
                    lebar = sc.nextInt();
                    bg.setPersegiPanjang(panjang, lebar);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Luas Persegi Panjang     : " + bg.getLPersegiP());
                    System.out.println("Keliling Persegi Panjang : " + bg.getKPersegiP());
                    break;

                case 4:
                    int jari;
                    System.out.println("------------------ LINGKARAN ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Lingkaran");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Jari Jari : ");
                    jari = sc.nextInt();
                    bg.setLingkaran(jari);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Luas Lingkaran     : " + bg.getLLingkaran());
                    System.out.println("Keliling Lingkaran : " + bg.getKLingkaran());
                    break;

                case 5:
                    int tinggiJG, alasJG, smJG;
                    System.out.println("------------------ JAJAR GENJANG ------------------");
                    System.out.println("Sebelum Menghitung Luas Dan Keliling Jajar Genjang");
                    System.out.println("Silahkan Mengisi Data Berikut!");
                    System.out.println();
                    System.out.print("Set Alas        : ");
                    alasJG = sc.nextInt();
                    System.out.print("Set Tinggi      : ");
                    tinggiJG = sc.nextInt();
                    System.out.print("Set Sisi Miring : ");
                    smJG = sc.nextInt();
                    bg.setJajarGenjang(tinggiJG, alasJG, smJG);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Luas Lingkaran     : " + bg.getLJG());
                    System.out.println("Keliling Lingkaran : " + bg.getKJG());
                    break;

                case 6:
                    System.out.println("Keluar dari Program...");
                    System.exit(0);
                    break;
            }

            // Bad Menu Option Direct
            if (choice > 6 || choice < 1) {
                System.out.println("Pilihan Tidak Ada Di Menu! Coba Ulangi");
                do {
                    choice = sc.nextInt();
                } while (choice < 6);
            }

        } while (choice < 6);

        sc.close();
    }
}
