import java.util.Scanner;

public class KuistTest {
    private static Scanner sc = new Scanner(System.in);
    private static int input_menu;

    public static void main(String[] args) {
        Segitiga st1 = new Segitiga();
        Persegi p1 = new Persegi();
        PersegiPanjang pp1 = new PersegiPanjang();
        Lingkaran l1 = new Lingkaran();
        JajarGenjang jg1 = new JajarGenjang();

        System.out.println("===== Menghitung Luas dan Keliling ====");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");

        System.out.print("- Masukkan angka = ");
        input_menu = sc.nextInt();

        switch (input_menu) {
            case 1:
                int alas, tinggi;
                System.out.print("Tinggi : ");
                tinggi = sc.nextInt();
                st1.setTinggi(tinggi);
                System.out.print("Alas : ");
                alas = sc.nextInt();
                st1.setAlas(alas);
                System.out.println("Luas : " + st1.getLuas());
                System.out.println("Keliling : " + st1.getKeliling());
                System.out.println();
                break;
            case 2:
                int sisi1;
                System.out.print("Sisi : ");
                sisi1 = sc.nextInt();
                p1.setSisi(sisi1);
                System.out.println("Luas : " + p1.getLuas());
                System.out.println("Keliling : " + p1.getKeliling());
                System.out.println();
                break;
            case 3:
                int panjang, lebar;
                System.out.print("Panjang : ");
                panjang = sc.nextInt();
                pp1.setPanjang(panjang);
                System.out.print("Lebar :");
                lebar = sc.nextInt();
                pp1.setLebar(lebar);
                System.out.println("Luas : " + pp1.getLuas());
                System.out.println("Keliling : " + pp1.getKeliling());
                System.out.println();
                break;
            case 4:
                int jari;
                System.out.print("Jari-Jari : ");
                jari = sc.nextInt();
                l1.setJejari(jari);
                System.out.println("Luas : " + l1.getLuas());
                System.out.println("Keliling : " + l1.getKeliling());
                System.out.println();
                break;
            case 5:
                int alas1, tinggi1, miring1;
                System.out.print("Alas : ");
                alas1 = sc.nextInt();
                jg1.setAlas(alas1);
                System.out.print("Tinggi : ");
                tinggi1 = sc.nextInt();
                jg1.setTinggi(tinggi1);
                System.out.print("Sisi Miring : ");
                miring1 = sc.nextInt();
                jg1.setSisiMiring(miring1);
                System.out.println("Luas : " + jg1.getLuas());
                System.out.println("Keliling : " + jg1.getKeliling());
                System.out.println();
                break;

            default:
                System.out.println("Menu tidak ada");
                break;
        }
    }
}
