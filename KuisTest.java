package Kuis1;
import java.util.Scanner;
/**
 * Nama      : Rofika Nur 'Aini
 * NIM       : 2041720099
 * No. Absen : 24
 * Kelas     : 2B
 **/
public class KuisTest {
    static void menu(){
        System.out.println("");
        System.out.println("-------MENGHITUNG LUAS DAN KELILING-------");
        System.out.println("---------------BANGUN DATAR---------------");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("Silahkan memasukkan pilhan menu bangun datar");
        System.out.print("Pilih >>> ");
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("-----------------SEGITIGA-------------------");
                    System.out.println("Silahkan memasukkan alas dan tinggi segitiga");
                    System.out.print("Alas      : ");
                    double alas = sc.nextDouble();
                    System.out.print("Tinggi    : ");
                    double tinggi = sc.nextDouble();
                    Segitiga st = new Segitiga(alas, tinggi);
                    System.out.println("--------------------------------------------");
                    System.out.println("Luas Segitiga adalah "+st.hitungLuas(alas, tinggi));
                    System.out.println("Keliling Segitiga adalah "+st.hitungKeliling(alas, tinggi));
                    break;
                case 2:
                    System.out.println("-------------PERSEGI------------");
                    System.out.println("Silahkan memasukkan sisi persegi");
                    System.out.print("Sisi      : ");
                    int sisi = sc.nextInt();
                    Persegi p = new Persegi(sisi);
                    System.out.println("--------------------------------------------");
                    System.out.println("Luas Persegi adalah "+p.hitungLuas(sisi));
                    System.out.println("Keliling Persegi adalah "+p.hitungKeliling(sisi));
                    break;
                case 3:
                    System.out.println("------------------PERSEGI PANJANG--------------------");
                    System.out.println("Silahkan memasukkan panjang dan lebar persegi panjang");
                    System.out.print("Panjang      : ");
                    int panjang = sc.nextInt();
                    System.out.print("Lebar        : ");
                    int lebar = sc.nextInt();
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    System.out.println("--------------------------------------------");
                    System.out.println("Luas Peresgi Panjang adalah "+pp.hitungLuas(panjang, lebar));
                    System.out.println("Keliling Persegi Panjang adalah "+pp.hitungKeliling(panjang, lebar));
                    break;
                case 4:
                    System.out.println("--------------LINGKARAN----------------");
                    System.out.println("Silahkan memasukkan jari-jari lingkaran");
                    System.out.print("Jari-jari      : ");
                    int r = sc.nextInt();
                    Lingkaran l = new Lingkaran(r);
                    System.out.println("--------------------------------------------");
                    System.out.println("Luas Lingkaran adalah "+l.hitungLuas(r));
                    System.out.println("Keliling Lingkaran adalah "+l.hitungKeliling(r));
                    break;
                case 5:
                    System.out.println("------------------------JAJARAN GENJANG--------------------------");
                    System.out.println("Silahkan memasukkan alas, tinggi, dan sisi miring jajaran genjang");
                    System.out.print("Alas           : ");
                    double a = sc.nextDouble();
                    System.out.print("Tinggi         : ");
                    double b = sc.nextDouble();
                    System.out.print("Sisi Miring    : ");
                    double c = sc.nextDouble();
                    JajarGenjang j = new JajarGenjang(a, b, c);
                    System.out.println("--------------------------------------------");
                    System.out.println("Luas jajaran genjang adalah "+j.hitungLuas(a, b));
                    System.out.println("Keliling jajaran genjang adalah "+j.hitungKeliling(a, c));
                    break;
            }          
        }while(pilih == 1 | pilih == 2 | pilih == 3 | pilih == 4 | pilih == 5);
    }
}
