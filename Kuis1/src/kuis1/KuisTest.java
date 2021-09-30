/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;
import java.util.Scanner;
/**
 *
 * @author SMK TELKOM
 */
public class KuisTest {
    public static void Menu(){
        System.out.println("Masukkan Menu Yang Anda Inginkan : ");
        System.out.println("**********************************");
        System.out.println("1. Hitung Segitiga");
        System.out.println("2. Hitung Persegi");
        System.out.println("3. Hitung Persegi Panjang");
        System.out.println("4. Hitung Lingkaran");
        System.out.println("5. Hitung Jajar Genjang");
        System.out.println("6. Keluar");
        System.out.println("**********************************");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Segitiga sg = new Segitiga();
        Persegi psg = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lk = new Lingkaran();
        JajarGenjang jg = new JajarGenjang();
     
        int Pilih;
        do{
            Menu();
            Pilih = sc.nextInt();
            switch(Pilih){
                case 1:
                    System.out.println("Menghitung Segitiga");
                    sg.setAlas(2);
                    sg.setTinggi(4);
                    sg.getMiring(3);
                    System.out.println("Luas Segitiga     : "+sg.getLuasSegitiga());
                    System.out.println("Keliling Segitiga : "+sg.getKelilingSegitiga());
                    break;
                case 2: 
                    System.out.println("Menghitung Persegi");
                    psg.setSisi(5);
                    System.out.println("Luas Persegi     : "+psg.getLuaspersegi());
                    System.out.println("Keliling Persegi : "+psg.getKelilingpersegi());
                    break;
                case 3:
                    System.out.println("Menghitung Persegi Panjang");
                    pp.setPanjang(5);
                    pp.setLebar(5);
                    System.out.println("Luas Persegi Panjang     : "+pp.getLuasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang : "+pp.getKelilingPersegiPanjang());
                    break;
                case 4:
                    System.out.println("Menghitung Lingkaran");
                    lk.setR(3.5);
                    lk.setPhi(2.5);
                    System.out.println("Luas Lingkaran     : "+lk.getLuas());
                    System.out.println("Keliling Lingkaran : "+lk.getKeliling());
                    break;
                case 5:
                    System.out.println("Menghitung Jajar Genjang");
                    jg.getAlas(2);
                    jg.getTinggi(5);
                    jg.getMiring(2);
                    System.out.println("Luas Jajar Genjang     : "+jg.getLuasJajarGenjang());
                    System.out.println("Keliling Jajar Genjang : "+jg.getKelilingJajarGenjang());
                    break;
            }
        } while (Pilih != 6) ;
    }
}
