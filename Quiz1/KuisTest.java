/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import java.util.Scanner;

/**
 *
 * @author Aku
 */
public class KuisTest {
    static Scanner sc = new Scanner(System.in);
    static Segitiga sg = new Segitiga();
    static Persegi pg = new Persegi();
    static PersegiPanjang pgpj = new PersegiPanjang();
    static Lingkaran lkg = new Lingkaran();
    static JajarGenjang jjg = new JajarGenjang();
    
    public static void main(String[] args) {
        menuAwal();
    }
    
    static void menuAwal(){
        String menu ="\t\tBangun Datar"
                + "\n1. Segitiga"
                + "\n2. Persegi"
                + "\n3. Persegi Panjang"
                + "\n4. Lingkaran"
                + "\n5. Jajar Genjang"
                + "\n6. Exit"
                + "\nPilih : ";
        sc.next();
        int pilih = sc.nextInt();
        switch(pilih){
            case 1 -> menuSg();
            case 2 -> menuPg();
            case 3 -> menuPgPj();
            case 4 -> menuLkg();
            case 5 -> menuJjg();
            case 6 -> System.exit(0);
        }
    }
    
    static void menuSg(){
        String menuSg ="\t\tSegitiga"
                + "\n1. Input Alas"
                + "\n2. Input Tinggi"
                + "\n3. Hitung Luas"
                + "\n4. Hitung Keliling"
                + "\n5. Exit"
                + "\n6. Kembali"
                + "\nPilih : ";
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("Masukkan panjang alas");
                double a = sc.nextDouble(); 
                sg.setA(a);
                menuSg();
                break;
                
            case 2:
                System.out.println("Masukkan tinggi");
                double t = sc.nextDouble(); 
                sg.setB(t);
                menuSg(); 
                break;
            case 3: 
                System.out.println("Luas : "+sg.luasSegitiga());
                menuSg();
                break;
            case 4:
                System.out.println("Keliling : "+sg.kelilingSegitiga());
                menuSg();
                break;
            case 5: System.exit(0); break;
            case 6: menuAwal(); break;
        }
    }
    
    static void menuPg(){
        String menuSg ="\t\tPersegi"
                + "\n1. Input Sisi"
                + "\n2. Hitung Luas"
                + "\n3. Hitung Keliling"
                + "\n4. Exit"
                + "\n5. Kembali"
                + "\nPilih : ";
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 -> {
                System.out.println("Masukkan panjang sisi");
                int a = sc.nextInt(); 
                pg.setS(a);
                menuPg();
            }
                
            case 2 -> {
                System.out.println("Luas : "+pg.luasPersegi());
                menuPg();
            }
            case 3 -> { 
                System.out.println("Keliling : "+pg.kelilingPersegi());
                menuPg();
            }
            case 4 -> System.exit(0);
            case 5 -> menuAwal();         }
    }
    
    static void menuPgPj(){
        String menuPgpj ="\t\tPersegi Panjang"
                + "\n1. Input Panjang"
                + "\n2. Input Lebar"
                + "\n3. Hitung Luas"
                + "\n4. Hitung Keliling"
                + "\n5. Exit"
                + "\n6. Kembali"
                + "\nPilih : ";
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 -> {
                System.out.println("Masukkan panjang ");
                int p = sc.nextInt(); 
                pgpj.setP(p);
                menuPgPj();
            }
                
            case 2 -> {
                System.out.println("Masukkan lebar");
                int l = sc.nextInt(); 
                pgpj.setL(l);
                menuPgPj();
            }
            case 3 -> { 
                System.out.println("Luas : "+pgpj.luasPersegiPanjang());
                menuSg();
            }
            case 4 -> {
                System.out.println("Keliling : "+pgpj.kelilingPersegiPanjang());
                menuSg();
            }
            case 5 -> System.exit(0);
            case 6 -> menuAwal();         }
    }
    
    static void menuLkg(){
        String menuSg ="\t\tLingkaran"
                + "\n1. Input Jari jari"
                + "\n2. Hitung Luas"
                + "\n3. Hitung Keliling"
                + "\n4. Exit"
                + "\n5. Kembali"
                + "\nPilih : ";
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 -> {
                System.out.println("Masukkan panjang Jari jari");
                double a = sc.nextDouble(); 
                lkg.setR(a);
                menuLkg();
            }
                
            case 2 -> {
                System.out.println("Luas : "+lkg.luasLingkaran());
                menuLkg();
            }
            case 3 -> { 
                System.out.println("Keliling : "+lkg.kelilingLingkaran());
                menuLkg();
            }
            case 4 -> System.exit(0);
            case 5 -> menuAwal();
        }
    }
    
    static void menuJjg(){
        String menuPgpj ="\t\tJajar Genjang"
                + "\n1. Input alas"
                + "\n2. Input tinggi"
                + "\n3. Hitung Luas"
                + "\n4. Hitung Keliling"
                + "\n5. Exit"
                + "\n6. Kembali"
                + "\nPilih : ";
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 -> {
                System.out.println("Masukkan panjang alas");
                int p = sc.nextInt(); 
                jjg.setAlas(p);
                menuJjg();
            }
                
            case 2 -> {
                System.out.println("Masukkan tinggi");
                int l = sc.nextInt(); 
                jjg.setTinggi(l);
                menuJjg();
            }
            case 3 -> { 
                System.out.println("Luas : "+jjg.luasJajarGenjang());
                menuJjg();
            }
            case 4 -> {
                System.out.println("Keliling : "+jjg.kelilingJajarGenjang());
                menuJjg();
            }
            case 5 -> System.exit(0);
            case 6 -> menuAwal();
    }
    }
}
