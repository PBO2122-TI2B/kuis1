/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class KuisTest {
    public static void menu(){
        System.out.println("Masukkan menu yang di inginkan:");
        System.out.println("1. Hitung Segitiga");
        System.out.println("2. Hitung Persegi");
        System.out.println("3. Hitung Persegi Panjang");
        System.out.println("4. Hitung Lingkaran");
        System.out.println("5. Hitung Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Segitiga sgt = new Segitiga();
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lkr = new Lingkaran();
        JajarGenjang jg = new JajarGenjang();
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    sgt.setAlas(5.5);
                    sgt.setTinggi(8.2);
                    sgt.getSisiM();
                    sgt.cetak();
                    System.out.println("Luas Segitiga : "+sgt.getLuas());
                    System.out.println("Keliling Segitiga : "+sgt.getKeliling());
                    break;
                case 2: 
                    System.out.println("Menghitung Persegi");
                    p.setSisi(10);
                    p.cetak();
                    System.out.println("Luas Persegi : "+p.getLuas());
                    System.out.println("Keliling Persegi : "+p.getKeliling());
                    break;
                case 3:
                    System.out.println("Menghitung Persegi Panjang");
                    pp.setPanjang(10);
                    pp.setLebar(5);
                    pp.cetak();
                    System.out.println("Luas Persegi Panjang : "+pp.getLuas());
                    System.out.println("Keliling Persegi Panjang : "+pp.getKeliling());
                    break;
                case 4:
                    System.out.println("Menghitung Lingkaran");
                    lkr.setR(7.5);
                    lkr.setPhi(3.5);
                    lkr.cetak();
                    System.out.println("Luas Lingkaran : "+lkr.getLuas());
                    System.out.println("Keliling Lingkaran : "+lkr.getKeliling());
                    break;
                case 5:
                    System.out.println("Menghitung Jajar Genjang");
                    jg.setAlas(5);
                    jg.setTinggi(10);
                    jg.setSisi(8);
                    jg.cetak();
                    System.out.println("Luas Jajar Genjang : "+jg.getLuas());
                    System.out.println("Keliling Jajar Genjang : "+jg.getKeliling());
                    break;
            }
        } while (Pilih != 6) ;
    }
}
