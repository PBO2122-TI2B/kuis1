package bangunDatar;
import java.util.Scanner;
public class KuisTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pilih = 0;
        do{
            menu();
            System.out.print("Masukkan pilihan Anda: ");
            pilih = sc.nextInt();
            System.out.println("=====================================");
                if(pilih == 1){
                    Segitiga sg1 = new Segitiga();
                            System.out.print("Masukkan sisi A : ");
                            int a = sc.nextInt();
                            System.out.print("Masukkan sisi B : ");
                            int b = sc.nextInt();
                            System.out.print("Masukkan sisi C : ");
                            int c = sc.nextInt();

                            sg1.setSisiA(a);
                            sg1.setSisiB(b);
                            sg1.setSisiC(c);

                            System.out.println("Sisi A : " + sg1.getSisiA());
                            System.out.println("Sisi B : " + sg1.getSisiB());
                            System.out.println("Sisi C : " + sg1.getSisiC());
                            
                            System.out.println("Keliling Segitiga : " + sg1.hitungKelSg());
                            
                            System.out.println("Keliling Segitiga : " + sg1.hitungLuasSg());
                }else if(pilih == 2){
                    Persegi p1 = new Persegi();

                            System.out.print("Masukkan sisi : ");
                            int sisi = sc.nextInt();
                            p1.setSisi(sisi);

                            System.out.println("Sisi : " + p1.getSisi());

                            System.out.println("Keliling Persegi : " + p1.hitungKelPsg());

                            System.out.println("Keliling Persegi : " + p1.hitungLuasPsg());
                }else if(pilih ==3){
                    PersegiPanjang pp1 = new PersegiPanjang();
                            System.out.print("Masukkan panjang : ");
                            int panjang = sc.nextInt();
                            System.out.print("Masukkan lebar : ");
                            int lebar = sc.nextInt();
                            pp1.setLebar(lebar);
                            pp1.setPanjang(panjang);

                            System.out.println("Panjang : " + pp1.getPanjang());
                            System.out.println("Lebar : " + pp1.getLebar());

                            System.out.println("Keliling Persegi Panjang : " + pp1.hitungKelPsgPjg());

                            System.out.println("Luas Persegi Panjang : " + pp1.hitungLuasPsgPjg());
                }else if(pilih == 4){
                    Lingkaran l1= new Lingkaran();

                            System.out.print("Masukkan jari-jari : ");
                            double r = sc.nextInt();
                            l1.setJari(r);

                            System.out.println("Jari-jari Lingkaran : " + l1.getJari());

                            System.out.println("Keliling Lingkaran : " + l1.hitungKelLing());

                            System.out.println("Luas Lingkaran : " + l1.hitungLuasLing());
                }else if(pilih == 5){
                    JajarGenjang j1 = new JajarGenjang();

                            System.out.print("Masukkan sisi alas : ");
                            int alas = sc.nextInt();
                            System.out.print("Masukkan sisi miring : ");
                            int miring = sc.nextInt();
                            System.out.print("Masukkan tinggi : ");
                            int tinggi = sc.nextInt();

                            j1.setSisiAlas(alas);
                            j1.setSisiMiring(miring);
                            j1.setTinggi(tinggi);

                            System.out.println("sisi alas : " + j1.getSisiAlas());
                            System.out.println("sisi miring : " + j1.getSisiMiring());
                            System.out.println("tinggi : " + j1.getTinggi());

                            System.out.println("Keliling Jajargenjang : " + j1.hitungKelJg());

                            System.out.println("Luas Jajargenjang : " + j1.hitungLuasJg());
                }
            }while(pilih < 6);
    } 
    public static void menu() {
        System.out.println("MENU BANGUN DATAR");
        System.out.println("=====================================");
        System.out.println("Memilih Menu");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("=====================================");
    }
}
