package kuis;
import java.util.Scanner;

public class KuisTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        int menu = 0;

        do{
            System.out.println("Selamat datang di kalkulator bangun datar!");
            System.out.println("Masukkan angka 1-5, diluar itu quit system");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.print("Pilih satu bangun datar: ");
            pilihan = sc.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println();
                    System.out.println("Bangun datar: Segitiga");
                    Segitiga segitiga = new Segitiga();
                    System.out.print("Masukkan alas: ");
                    double a = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    double t = sc.nextInt();
                    segitiga.setValue(a, t);
                    System.out.println();

                    do{
                        System.out.println("1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.print("Masukkan pilihan: ");
                        menu = sc.nextInt();
                        if(menu == 1) {
                            System.out.println("Luas: " + segitiga.getLuas());
                        } else if(menu == 2) {
                            System.out.println("Keliling: " + segitiga.getKeliling());
                        }
                    } while(menu > 0 && menu < 3);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Bangun datar: Persegi");
                    Persegi persegi = new Persegi();
                    System.out.print("Masukkan sisi: ");
                    double s = sc.nextInt();
                    persegi.setValue(s);
                    System.out.println();

                    do{
                        System.out.println("1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.print("Masukkan pilihan: ");
                        menu = sc.nextInt();
                        if(menu == 1) {
                            System.out.println("Luas: " + persegi.getLuas());
                        } else if(menu == 2) {
                            System.out.println("Keliling: " + persegi.getKeliling());
                        }
                    } while(menu > 0 && menu < 3);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Bangun datar: Persegi Panjang");
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    System.out.print("Masukkan panjang: ");
                    double p = sc.nextInt();
                    System.out.print("Masukkan lebar: ");
                    double l = sc.nextInt();
                    persegiPanjang.setValue(p, l);
                    System.out.println();

                    do{
                        System.out.println("1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.print("Masukkan pilihan: ");
                        menu = sc.nextInt();
                        if(menu == 1) {
                            System.out.println("Luas: " + persegiPanjang.getLuas());
                        } else if(menu == 2) {
                            System.out.println("Keliling: " + persegiPanjang.getKeliling());
                        }
                    } while(menu > 0 && menu < 3);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Bangun datar: Lingkaran");
                    Lingkaran lingkaran = new Lingkaran();
                    System.out.print("Masukkan jari-jari: ");
                    double r = sc.nextInt();
                    lingkaran.setValue(r);
                    System.out.println();

                    do{
                        System.out.println("1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.print("Masukkan pilihan: ");
                        menu = sc.nextInt();
                        if(menu == 1) {
                            System.out.println("Luas: " + lingkaran.getLuas());
                        } else if(menu == 2) {
                            System.out.println("Keliling: " + lingkaran.getKeliling());
                        }
                    } while(menu > 0 && menu < 3);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Bangun datar: Jajar Genjang");
                    JajarGenjang jajarGenjang = new JajarGenjang();
                    System.out.print("Masukkan alas: ");
                    double a2 = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    double t2 = sc.nextInt();
                    System.out.print("Masukkan sisi miring: ");
                    double m = sc.nextInt();
                    jajarGenjang.setValue(a2, t2, m);
                    System.out.println();

                    do{
                        System.out.println("1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.print("Masukkan pilihan: ");
                        menu = sc.nextInt();
                        if(menu == 1) {
                            System.out.println("Luas: " + jajarGenjang.getLuas());
                        } else if(menu == 2) {
                            System.out.println("Keliling: " + jajarGenjang.getKeliling());
                        }
                    } while(menu > 0 && menu < 3);
                    break;
                default:
                    System.out.println("Terima kasih!");
                    break;
            }
        } while(pilihan > 0 && pilihan < 6);
    }
}
