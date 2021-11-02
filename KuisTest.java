/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestKuis;

/**
 *
 * @author ALIFIYUL
 */
import java.util.Scanner;
import number1.Segitiga;
import number2.Persegi;
import number3.PersegiPanjang;
import number4.Lingkaran;
import number5.JajarGenjang;

public class KuisTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("PROGRAM MENGHITUNG LUAS dan KELILING BANGUN ");
        System.out.println("==========================");
        System.out.println("1.Luas dan Keliling Segitiga ");
        System.out.println("2.Luas dan Keliling Persegi  ");
        System.out.println("3.Luas dan Keliling PersegiiPanjang ");
        System.out.println("4.Luas dan Keliling Lingkaran ");
        System.out.println("5.Luas dan Keliling Jajar Genjang ");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Masukkan Pilihan ANDA ");
        System.out.print("Pilih luas : ");
        int pilih = input.nextInt();
        System.out.println("==========================");

        switch (pilih) {
            case 1:
                Segitiga S = new Segitiga();

                System.out.print("Masukkan Nilai Alas:");
                float alas = input.nextFloat();
                System.out.print("Masukkan Nilai Tinggi:");
                float tinggi = input.nextFloat();
                System.out.print("Masukkan sisi A:");
                float sisiA = input.nextFloat();
                System.out.print("Masukkan sisi B:");
                float sisiB = input.nextFloat();
                System.out.print("Masukkan sisi C:");
                float sisiC = input.nextFloat();

                S.setAlas(alas);
                S.setTinggi(tinggi);
                S.setsisiA(sisiA);
                S.setsisiB(sisiB);
                S.setsisiC(sisiC);
                System.out.println();
                System.out.println("Nilai Alas = " + S.getAlas());
                System.out.println("Nilai Tinggi = " + S.getTinggi());
                System.out.println();
                System.out.println("Nilai Luas Segitiga Adalah = " + S.getLuasSegitiga());
                System.out.println("==========================================");
                System.out.println();
                System.out.println("Sisi A = " + S.getsisiA());
                System.out.println("Sisi B = " + S.getsisiB());
                System.out.println("Sisi C = " + S.getsisiC());
                System.out.println("Nilai Keliling Segitiga Adalah = " + S.getkelilingSegitiga());
                System.out.println("==========================================");
                break;

            case 2:
                Persegi P = new Persegi();
                System.out.print("Masukkan Nilai Sisi:");
                float Sisi = input.nextFloat();

                P.setSisiPersegi(Sisi);

                System.out.println();
                System.out.println("Nilai Sisi = " + P.getSisi());
                System.out.println();
                System.out.println("Nilai Luas Persegi Adalah = " + P.getluasPersegi());
                System.out.println("Nilai Keliling Persegi Adalah = " + P.getkelilingPersegi());
                System.out.println("==========================================");
                break;

            case 3:
                PersegiPanjang Pl = new PersegiPanjang();

                System.out.print("Masukkan Nilai Panjang:");
                float panjang = input.nextFloat();
                System.out.print("Masukkan Nilai Lebar:");
                float lebar = input.nextFloat();

                Pl.setPanjang(panjang);
                Pl.setLebar(lebar);

                System.out.println();
                System.out.println("Nilai Sisi = " + Pl.getPanjang());
                System.out.println("Nilai Sisi = " + Pl.getLebar());
                System.out.println();
                System.out.println("Nilai Luas Persegi Adalah = " + Pl.getluasPersegiPanjang());
                System.out.println("Nilai Keliling Persegi Adalah = " + Pl.getkelilingPersegiPanjang());
                System.out.println("==========================================");
                break;
            case 4:
                Lingkaran li = new Lingkaran();
                System.out.print("Masukkan Nilai Jari-jari:");
                float r = input.nextFloat();

                li.setJariJari(r);

                System.out.println();
                System.out.println("Nilai Jari Jari : = " + li.getJariJari());
                System.out.println();
                System.out.println("Nilai Luas Lingkaran Adalah = " + li.getLuasLingkaran());
                System.out.println("Nilai Keliling Lingkaran Adalah = " + li.getKelilingLingkaran());
                System.out.println("==========================================");
                break;
            case 5:
                JajarGenjang JG = new JajarGenjang();
                System.out.print("Masukkan Nilai Alas:");
                float alas1 = input.nextFloat();
                System.out.print("Masukkan Nilai Tinggi:");
                float tinggi1 = input.nextFloat();
                System.out.print("Masukkan Sisi Miring:");
                float sisiMiring = input.nextFloat();

                JG.setAlas(alas1);
                JG.setTinggi(tinggi1);
                JG.setSisiMiring(sisiMiring);

                System.out.println();
                System.out.println("Nilai Alas = " + JG.getAlas());
                System.out.println("Nilai Tinggi = " + JG.getTinggi());
                System.out.println();
                System.out.println("Nilai Luas Jajar Genjang Adalah = " + JG.getLuasJajarGenjang());
                System.out.println("==========================================");
                System.out.println();
                System.out.println("Sisi Miring = " + JG.getsisiMiring());
                System.out.println("Nilai Keliling Segitiga Adalah = " + JG.getkelilingJajarGenjang());
                System.out.println("==========================================");
                break;

        }
    }
}
