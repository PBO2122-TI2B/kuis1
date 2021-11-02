/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class KuisTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Segitiga sg = new Segitiga();
        Persegi pg = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lr = new Lingkaran();
        Jajargenjang jg = new Jajargenjang();
        
        int pilih;
        char keluar;
        do {
            System.out.println("============================================================");
            System.out.println("   OPERASI MENGHITUNG LUAS DAN KELILING PADA BANGUN DATAR   ");
            System.out.println("============================================================");
            System.out.println("Silahkan Pilih Bangun Datar yang Anda Inginkan");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
                
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nilai Alas   :");
                    int alas = sc.nextInt();
                    System.out.print("Masukkan Nilai Tinggi :");
                    int tinggi = sc.nextInt();
                    sg.setAlas(alas);
                    sg.setTinggi(tinggi);
                    System.out.println();
                    System.out.println("Nilai Alas     : " + sg.getAlas());
                    System.out.println("Nilai Tinggi   : " + sg.getTinggi());
                    System.out.println("------------------------------------------------------");
                    System.out.println();
                    System.out.println("Nilai Luas Segitiga Adalah : " + sg.getLuasSegitiga());
                    System.out.println("Nilai Keliling Segitiga Adalah : " + sg.getKelilingSegitiga());
                case 2:
                    
                case 3:
                case 4:
                case 5:
            }
        } 
    }
}

