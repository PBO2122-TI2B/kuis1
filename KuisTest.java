package kuistest;
//09 Annisa Fitri Yuliandra 2041720123
import java.util.Scanner;
public class KuisTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean RunProgram = true;
        do {
        System.out.println("\n============= MENU =============");
        System.out.println("[1] Segitiga");
        System.out.println("[2] Persegi");
        System.out.println("[3] Persegi Panjang");
        System.out.println("[4] Lingkaran");
        System.out.println("[5] Jajar Genjang");
        System.out.println("[6] Keluar");
        System.out.print("PILIH MENU : ");
        int Pilih_Menu = sc.nextInt();
            switch(Pilih_Menu){
                case 1 -> {
                    System.out.println("\n...Segitiga");
                    System.out.println("Masukkan Alas   : ");
                    double a = sc.nextDouble();
                    System.out.println("Masukkan Tinggi : ");
                    double t = sc.nextDouble();
                    Segitiga s = new Segitiga(a, t);
                    int Pilih;
                        do {
                        System.out.println("\n1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.println("3. Tampilkan Sisi Miring");
                        System.out.println("4. Berhenti Menghitung");
                        System.out.print("PILIH MENU : ");
                        Pilih = sc.nextInt();
                            switch(Pilih){
                                case 1 -> {
                                    System.out.println("\nLuas = "+s.getAlas()+" * "+s.getTinggi()+" * 0,5 = "+s.hitungLuas());
                                }
                                case 2 -> {
                                    System.out.println("\nKeliling = "+s.getAlas()+" + "+s.getTinggi()
                                            +" + "+s.hitungSisiMiring()
                                            +" = "+s.hitungKeliling());
                                }
                                case 3 -> {
                                    System.out.println("\nSisi Miring = "+s.hitungSisiMiring());
                                }
                                default -> System.out.println("Pilihan salah!");  
                            }
                        } while (Pilih != 4);
                }
                case 2 -> {
                    System.out.println("\n...Persegi");
                    System.out.println("Masukkan Sisi : ");
                    double s = sc.nextDouble();
                    Persegi p = new Persegi();
                    p.setSisi(s);
                    int Pilih;
                        do {
                        System.out.println("\n1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.println("3. Berhenti Menghitung");
                        System.out.print("PILIH MENU : ");
                        Pilih = sc.nextInt();
                            switch(Pilih){
                                case 1 -> {
                                    System.out.println("\nLuas = "+p.getSisi()+" * "+p.getSisi()+" = "+p.hitungLuas());
                                }
                                case 2 -> {
                                    System.out.println("\nKeliling = 4 * "+p.getSisi()+" = "+p.hitungKeliling());
                                }
                                default -> System.out.println("Pilihan salah!");  
                            }
                        } while (Pilih != 3);
                }
                case 3 -> {
                    System.out.println("\n...Persegi Panjang");
                    System.out.println("Masukkan Lebar  : ");
                    double l = sc.nextDouble();
                    System.out.println("Masukkan Tinggi : ");
                    double p = sc.nextDouble();
                    PersegiPanjang g = new PersegiPanjang(l, p);
                    int Pilih;
                        do {
                        System.out.println("\n1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.println("3. Berhenti Menghitung");
                        System.out.print("PILIH MENU : ");
                        Pilih = sc.nextInt();
                            switch(Pilih){
                                case 1 -> {
                                    System.out.println("\nLuas = "+g.getPanjang()+" * "+g.getLebar()+" = "+g.hitungLuas() );
                                }
                                case 2 -> {
                                    System.out.println("\nKeliling = 2 * ("+ g.getPanjang()+" + "+g.getLebar()
                                            +") = "+ g.hitungKeliling());
                                }
                                default -> System.out.println("Pilihan salah!");  
                            }
                        } while (Pilih != 3);
                }
                case 4 -> {
                    System.out.println("\n...Lingkaran");
                    System.out.println("Masukkan Jari-jari : ");
                    double r = sc.nextDouble();
                    Lingkaran l = new Lingkaran();
                    l.setR(r);
                    int Pilih;
                        do {
                        System.out.println("\n1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.println("3. Berhenti Menghitung");
                        System.out.print("PILIH MENU : ");
                        Pilih = sc.nextInt();
                            switch(Pilih){
                                case 1 -> {
                                    System.out.println("\nLuas = 3,14 * "+l.getR() +" * "+l.getR() +" = "+ l.hitungLuas());
                                }
                                case 2 -> {
                                    System.out.println("\nKeliling = 2 * 3,14 * "+ l.getR()+" = "+l.hitungKeliling() );
                                }
                                case 3 -> System.exit(0);
                                default -> System.out.println("Pilihan salah!");  
                            }
                        } while (Pilih != 3);
                }
                case 5 -> {
                    System.out.println("\n...Jajar Genjang");
                    System.out.println("Masukkan Alas        : ");
                    double a = sc.nextDouble();
                    System.out.println("Masukkan Tinggi      : ");
                    double t = sc.nextDouble();
                    System.out.println("Masukkan Sisi Miring : ");
                    double m = sc.nextDouble();
                    JajarGenjang j = new JajarGenjang(a, t, m);
                    int Pilih;
                        do {
                        System.out.println("\n1. Hitung Luas");
                        System.out.println("2. Hitung Keliling");
                        System.out.println("3. Berhenti Menghitung");
                        System.out.print("PILIH MENU : ");
                        Pilih = sc.nextInt();
                            switch(Pilih){
                                case 1 -> {
                                    System.out.println("\nLuas = "+j.getAlas()+" * "+ j.getTinggi()+" = "+j.hitungLuas() );
                                }
                                case 2 -> {
                                    System.out.println("\nKeliling = 2 * ("+j.getAlas()+" + "+ j.getSisiMiring() 
                                            +") = "+ j.hitungKeliling());
                                }
                                case 3 -> System.exit(0);
                                default -> System.out.println("Pilihan salah!");  
                            }
                        } while (Pilih != 3);
                }
                case 6 -> System.exit(0);
                default -> System.out.println("Pilihan salah!");  
            }
        } while (RunProgram);
        System.out.println(""); 
    }
}
