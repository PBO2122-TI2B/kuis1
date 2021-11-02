/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuistest;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class kuistest {
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
        Segitiga S = new Segitiga();
        Persegi ps = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        JajarGenjang j = new JajarGenjang();
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    S.setAlas(5.5);
                    S.setTinggi(8.2);
                    S.getSisiM();
                    S.cetak();
                    System.out.println("Luas Segitiga : "+S.getLuas());
                    System.out.println("Keliling Segitiga : "+S.getKeliling());
                    break;
                case 2: 
                    System.out.println("Menghitung Persegi");
                    ps.setSisi(10);
                    ps.cetak();
                    System.out.println("Luas Persegi : "+ps.getLuas());
                    System.out.println("Keliling Persegi : "+ps.getKeliling());
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
                    l.setR(7.5);
                    l.setPhi(3.5);
                    l.cetak();
                    System.out.println("Luas Lingkaran : "+lkr.getLuas());
                    System.out.println("Keliling Lingkaran : "+lkr.getKeliling());
                    break;
                case 5:
                    System.out.println("Menghitung Jajar Genjang");
                    j.setAlas(5);
                    j.setTinggi(10);
                    j.setSisi(8);
                    j.cetak();
                    System.out.println("Luas Jajar Genjang : "+jg.getLuas());
                    System.out.println("Keliling Jajar Genjang : "+jg.getKeliling());
                    break;
            }
        } while (Pilih != 6) ;
    }
}
