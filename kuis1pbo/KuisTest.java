package Kuis1;

import java.util.Scanner;
public class KuisTest {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            Segitiga sg = new Segitiga();
            Persegi pg = new Persegi();
            PersegiPanjang pp = new PersegiPanjang();
            Lingkaran lk = new Lingkaran();
            JajarGenjang jg = new JajarGenjang();

            int menu;
            int pilih;

            do {
                System.out.println("1. Segitiga");
                System.out.println("2. Persegi");
                System.out.println("3. Persegi Panjang");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.print("Pilih Bangun Datar : ");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("=============SEGITIGA==============");
                        sg.setA(6);
                        sg.setB(8);
                        sg.setC();
                        System.out.println("Alas Segitiga : " + sg.getA());
                        System.out.println("Tinggi Segitiga : " + sg.getB());
                        System.out.println("Sisi Miring : " + sg.getC());
                        System.out.println("Perhitungan yang dicari?");
                        System.out.println("1. Luas ");
                        System.out.println("2. Keliling");
                        System.out.print("Pilihan Anda : ");
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.println("Luas Segitiga : " + sg.hitungLuas());
                        } else if (pilih == 2) {
                            System.out.println("Keliling  : " + sg.hitungKeliling());
                        } else {
                            System.out.println("Pilihan tidak ada!!");
                        }
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("================PERSEGI=============");
                        pg.setSisi(4);
                        System.out.println("Sisi Persegi : " + pg.getSisi());
                        System.out.println("Perhitungan yang dicari?");
                        System.out.println("1. Luas ");
                        System.out.println("2. Keliling");
                        System.out.print("Pilihan Anda : ");
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.println("Luas Persegi : " + pg.hitungLuas());


                        } else if (pilih == 2) {
                            System.out.println("Keliling Persegi : " + pg.hitungKeliling());
                        } else {
                            System.out.println("Pilihan tidak ada!!");
                        }
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("========PERSEGI PANJANG=======");
                        pp.setLebar(6);
                        pp.setPanjang(5);
                        System.out.println("Lebar Persegi Panjang : " + pp.getLebar());
                        System.out.println("Panjang Persegi Panjang : " + pp.getPanjang());
                        System.out.println("Perhitungan yang dicari?");
                        System.out.println("1. Luas ");
                        System.out.println("2. Keliling");
                        System.out.print("Pilihan Anda : ");
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.println("Luas Persegi Panjang : " + pp.hitungLuas());
                        } else if (pilih == 2) {
                            System.out.println("Keliling Persegi Panjang " + pp.hitungKeliling());
                        } else {
                            System.out.println("Pilihan tidak ada!!");
                        }
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("========LINGKARAN========");
                        lk.setPhi(3.14);
                        lk.setR(5);
                        System.out.println("Nilai Phi: " + lk.getPhi() + " \nNilai R : " + lk.getR());
                        System.out.println("Perhitungan yang dicari?");
                        System.out.println("1. Luas ");
                        System.out.println("2. Keliling");
                        System.out.print("Pilihan Anda : ");
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.println("Luas Lingkaran : " + lk.hitungLuas());
                        } else if (pilih == 2) {
                            System.out.println("Keliling Lingkaran : " + lk.hitungKeliling());
                        } else {
                            System.out.println("Pilihan tidak ada!!");
                        }
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("==========JAJAR GENJANG=========");
                        jg.setAlas(6);
                        jg.setSisiMiring(6);
                        jg.setTinggi(8);
                        System.out.println("Alas Jajar Genjang : " + jg.getAlas());
                        System.out.println("Tinggi Jajar Genjang : " + jg.getTinggi());
                        System.out.println("Sisi Miring Jajar Genjang : " + jg.getSisiMiring());
                        System.out.println("Perhitungan yang dicari?");
                        System.out.println("1. Luas ");
                        System.out.println("2. Keliling");
                        System.out.print("Pilihan Anda : ");
                        pilih = sc.nextInt();
                        if (pilih == 1) {
                            System.out.println("Luas Jajar Genjang : " + jg.hitungLuas());
                        } else if (pilih == 2) {
                            System.out.println("Keliling Jajar Genjang : " + jg.hitungKel());
                        } else {
                            System.out.println("Pilihan tidak ada!!");
                        }
                        System.out.println("");
                        break;
                }
            }while (menu==1 || menu==2 || menu==3 || menu==4 || menu==5 );
        }
}
