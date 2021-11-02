/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class KuisTest {
     public static void menu(){
        System.out.println("=====DAFTAR MENU BANGUN DATAR=====");
        System.out.println("1. Hitung Segitiga");
        System.out.println("2. Hitung Persegi");
        System.out.println("3. Hitung Persegi Panjang");
        System.out.println("4. Hitung Lingkaran");
        System.out.println("5. Hitung Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("==================================");
        System.out.print("Masukkan Pilihan: ");
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SegitigaFarah s = new SegitigaFarah();
        PersegiFarah p = new PersegiFarah();
        PersegiPanjang pp = new PersegiPanjang();
        LingkaranFarah l = new LingkaranFarah();
        JajarGenjang j = new JajarGenjang();
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    s.setAlas(8);
                    s.setTinggi(8);
                    s.setBawah(5);
                    System.out.println("Luas Segitiga : "+s.getLuas());
                    System.out.println("Keliling Segitiga : "+s.getKeliling());
                    break;
                case 2: 
                    System.out.println("Menghitung Persegi");
                    p.setSisi(4);
                    System.out.println("Luas Persegi : "+p.getLuas());
                    System.out.println("Keliling Persegi : "+p.getKeliling());
                    break;
                case 3:
                    System.out.println("Menghitung Persegi Panjang");
                    pp.setAlas(10);
                    pp.setTinggi(5);
                    System.out.println("Luas Persegi Panjang : "+pp.getLuas());
                    System.out.println("Keliling Persegi Panjang : "+pp.getKeliling());
                    break;
                case 4:
                    System.out.println("Menghitung Lingkaran");
                    l.setR(7);
                    System.out.println("Luas Lingkaran : "+l.getLuas1());
                    System.out.println("Keliling Lingkaran : "+l.getKeliling1());
                    break;
                case 5:
                    System.out.println("Menghitung Jajar Genjang");
                    j.setAlas(2);
                    j.setTinggi(5);
                    j.setSisimrg(7);
                    System.out.println("Luas Jajar Genjang : "+j.getLuas());
                    System.out.println("Keliling Jajar Genjang : "+j.getKeliling());
                    break;
            }
        } while (Pilih != 6) ;
    }
}
