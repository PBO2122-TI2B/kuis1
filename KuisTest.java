import java.util.Scanner;
public class KuisTest {
    public static void menu(){
        System.out.println("Masukkan menu yang di inginkan:");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SegitigaKuis S = new Segitiga();
        persegiKuis ps = new Persegi();
        persegipanjangKuis pp = new PersegiPanjang();
        KuisLingkaran li = new Lingkaran();
        jajargenjang j= new JajarGenjang();
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    S.setAlas();
                    S.setTinggi();
                    S.getSisiM();
                    S.cetak();
                    System.out.println("Luas Segitiga : "+S.getLuas());
                    System.out.println("Keliling Segitiga : "+S.getKeliling());
                    break;
                case 2: 
                    System.out.println("Menghitung Persegi");
                    ps.setSisi();
                    ps.cetak();
                    System.out.println("Luas Persegi : "+ps.getLuas());
                    System.out.println("Keliling Persegi : "+ps.getKeliling());
                    break;
                case 3:
                    System.out.println("Menghitung Persegi Panjang");
                    pp.setPanjang();
                    pp.setLebar();
                    pp.cetak();
                    System.out.println("Luas Persegi Panjang : "+pp.getLuas());
                    System.out.println("Keliling Persegi Panjang : "+pp.getKeliling());
                    break;
                case 4:
                    System.out.println("Menghitung Lingkaran");
                    li.setR();
                    li.setPhi();
                    li.cetak();
                    System.out.println("Luas Lingkaran : "+li.getLuas());
                    System.out.println("Keliling Lingkaran : "+li.getKeliling());
                    break;
                case 5:
                    System.out.println("Menghitung Jajar Genjang");
                    j.setAlas();
                    j.setTinggi();
                    j.setSisi();
                    j.cetak();
                    System.out.println("Luas Jajar Genjang : "+j.getLuas());
                    System.out.println("Keliling Jajar Genjang : "+j.getKeliling());
                    break;
            }
        } while (Pilih != 6) ;
    }
}