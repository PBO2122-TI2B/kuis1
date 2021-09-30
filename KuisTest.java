import java.util.Scanner;
public class KuisTest {
    public static void main(String[] args) {
        int menu;
        do{
            System.out.println("==============MENU==============");
            System.out.println("1.Segitiga");
            System.out.println("2.Persegi");
            System.out.println("3.Persegi Panjang");
            System.out.println("4.Lingkaran");
            System.out.println("5.Jajar Genjang");
            System.out.println("6.Exit");
            System.out.println("================================");
            System.out.print("Masukkan menu yang dipilih:");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
        switch(menu){
            case 1:
            Segitiga sg1 = new Segitiga();
            System.out.print("Masukkan Alas:");
            double x = sc.nextDouble();
            System.out.print("Masukkan Tinggi:");
            double y = sc.nextDouble();
            sg1.setAlas(x);
            sg1.setTinggi(y);
            System.out.println("Luas dan Keliling Segitiga");
            System.out.println("Alas: " + sg1.getAlas());
            System.out.println("Tinggi: " + sg1.getTinggi());
            System.out.println("Luas: " + sg1.hitungLuas());
            System.out.println("Keliling: " + sg1.hitungKeliling());
            break;
            case 2:
            Persegi psg1 = new Persegi();
            System.out.print("Masukkan Sisi:");
            double a = sc.nextDouble();
            psg1.setSisi(a);
            System.out.println("Luas dan Keliling Persegi");
            System.out.println("Sisi: " + psg1.getSisi());
            System.out.println("Luas: " + psg1.hitungLuas());
            System.out.println("Keliling: " + psg1.hitungKeliling());
            break;
            case 3:
            PersegiPanjang pp1 = new PersegiPanjang();
            System.out.print("Masukkan Panjang:");
            double b = sc.nextDouble();
            System.out.print("Masukkan Lebar:");
            double c = sc.nextDouble();
            pp1.setPanjang(b);
            pp1.setLebar(c);
            System.out.println("Luas dan Keliling Persegi Panjang");
            System.out.println("Panjang: " + pp1.getPanjang());
            System.out.println("Lebar: " + pp1.getLebar());
            System.out.println("Luas: " + pp1.hitungLuas());
            System.out.println("Keliling: " + pp1.hitungKeliling());
            break;
            case 4:
            Lingkaran lkr1 = new Lingkaran();
            System.out.print("Masukkan r:");
            double d = sc.nextDouble();
            System.out.print("Masukkan phi:");
            double e = sc.nextDouble();
            lkr1.setR(d);
            lkr1.setPhi(e);
            System.out.println("Luas dan Keliling Lingkaran");
            System.out.println("r: " + lkr1.getR());
            System.out.println("Phi: " + lkr1.getPhi());
            System.out.println("Luas: " + lkr1.hitungLuas());
            System.out.println("Keliling: " + lkr1.hitungKeliling());
            break;
            case 5:
            JajarGenjang jg1 = new JajarGenjang();
            System.out.print("Masukkan Alas:");
            double f = sc.nextDouble();
            System.out.print("Masukkan Tinggi:");
            double g = sc.nextDouble();
            System.out.print("Masukkan Sisi Miring:");
            double h = sc.nextDouble();
            jg1.setAlas(f);
            jg1.setTinggi(g);
            jg1.setSisiMiring(h);
            System.out.println("Luas dan Keliling Jajar Genjang");
            System.out.println("Alas: " + jg1.getAlas());
            System.out.println("Tinggi: " + jg1.getTinggi());
            System.out.println("Sisi Miring: " + jg1.getSisiMiring());
            System.out.println("Luas: " + jg1.hitungLuas());
            System.out.println("Keliling: " + jg1.hitungKeliling());
            break;
        }
        }while (menu == 1|| menu == 2 || menu == 3 || menu == 4 || menu == 5);
    }
}