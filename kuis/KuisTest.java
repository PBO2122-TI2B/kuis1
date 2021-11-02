package BangungDatar;
import java.util.Scanner;
public class KuisTest {
    static int pilih;
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        Lingkaran lingkaran1 = new Lingkaran();
        JajarGenjang jajarGenjang1 = new JajarGenjang();
        Persegi persegi1 = new Persegi();
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("       Bangun Datar");
        System.out.println("-------------------------");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.print("Pilihan : ");
        int pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
                pilihMenuKedua();
                    pilih = sc.nextInt();
                    System.out.print("Alas : ");
                    float alas = sc.nextFloat();
                    segitiga1.setsisiA(alas);
                    System.out.print("Tinggi : ");
                    float tinggi = sc.nextFloat();
                    segitiga1.setSisiB(tinggi);
                if(pilih == 1){
                    System.out.println("Keliling : "+segitiga1.menghitungKeliling());
                }else{
                    System.out.println("Luas : "+segitiga1.menghitungLuas());
                }
                break;
            case 2:
                pilihMenuKedua();
                pilih = sc.nextInt();
                    System.out.print("Sisi : ");
                    double sisi = sc.nextDouble();
                    persegi1.setSisi(sisi);
                if(pilih == 1){
                    System.out.println("Keliling : "+persegi1.menghitungKeliling());
                }else{
                    System.out.println("Luas : "+persegi1.menghitungLuas());
                }
                break;
            case 3:
                pilihMenuKedua();
                    pilih = sc.nextInt();
                    System.out.print("Panjang : ");
                    double panjang = sc.nextDouble();
                    persegiPanjang1.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    double lebar = sc.nextDouble();
                    persegiPanjang1.setLebar(lebar);
                if(pilih == 1){
                    System.out.println("Keliling : "+persegiPanjang1.menghitungKeliling());
                }else{
                    System.out.println("Luas : "+persegiPanjang1.menghitungLuas());
                }
                break;
            case 4:
                pilihMenuKedua();
                pilih = sc.nextInt();
                    System.out.print("Jari-jari : ");
                    double r = sc.nextDouble();
                    lingkaran1.setJariJari(r);
                if(pilih == 1){
                    System.out.println("Keliling : "+lingkaran1.menghitungKeliling());
                }else{
                    System.out.println("Luas : "+lingkaran1.menghitungLuas());
                }
                break;
            case 5:
                pilihMenuKedua();
                    pilih = sc.nextInt();
                    System.out.print("Alas : ");
                    double a = sc.nextDouble();
                    jajarGenjang1.setAlas(a);
                    System.out.print("Tinggi : ");
                    double t = sc.nextDouble();
                    jajarGenjang1.setTinggi(t);
                    System.out.print("Sisi Miring : ");
                    double sm = sc.nextDouble();
                    jajarGenjang1.setSisiMiring(sm);
                if(pilih == 1){
                    System.out.println("Keliling : "+jajarGenjang1.menghitungKeliling());
                }else{
                    System.out.println("Luas : "+jajarGenjang1.menghitungLuas());
                }
                break;
        }
        System.out.println("-------------------------");
    }
    public static void pilihMenuKedua(){
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.print("Pilihan : ");
    }
}
