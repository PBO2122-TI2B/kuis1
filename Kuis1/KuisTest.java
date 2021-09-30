/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo1;

/**
 *
 * @author Chaidir Wiradhika
 */
import java.util.Scanner;
public class KuisTest {
    public static void menu(){
        System.out.println("Pilih Bangun Ruang yang Akan dihitung :");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Keluar");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Segitiga sgt = new Segitiga();
        Persegi p = new Persegi();
        persegiPanjang pp = new persegiPanjang();
        Lingkaran lkr = new Lingkaran();
        jajarGenjang jg = new jajarGenjang();
        
        int Pilih;
        do{
            menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    sgt.setAlas(5);
                    sgt.setTinggi(9);
                    sgt.setSisi(3);
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
                    jg.setSisimiring(8);
                    jg.cetak();
                    System.out.println("Luas Jajar Genjang : "+jg.getLuas());
                    System.out.println("Keliling Jajar Genjang : "+jg.getKeliling());
                    break;
            }
        } while (Pilih != 6) ;
    }
}