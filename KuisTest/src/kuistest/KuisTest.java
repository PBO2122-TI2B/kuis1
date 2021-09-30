/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuistest;

/**
 *
 * @author Amelia
 */
import java.util.Scanner;
public class KuisTest {
    public static void menu(){
        System.out.println("===MENU BANGUN DATAR===");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }
    public static void hitung(){
        System.out.println("Apa yang ingin anda hitung? ");
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Masukkan pilihan Anda: ");
    }
    public static void main(String[] args) {
        int pilih, choose;
        Segitiga sg = new Segitiga();
        Persegi pg = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran lg = new Lingkaran();
        JajarGenjang jg = new JajarGenjang();
        Scanner sc = new Scanner(System.in);
        
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan alas: ");
                    int a = sc.nextInt();
                    sg.setAlas(a);
                    System.out.print("Masukkan tinggi: ");
                    int b = sc.nextInt();
                    sg.setTinggi(b);
                    
                    hitung();
                    choose = sc.nextInt();
                    if(choose == 1){
                        sg.luasSegitiga();
                    }else if(choose == 2){
                        sg.kelSegitiga();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan sisi: ");
                    int s = sc.nextInt();
                    pg.setSisi(s);
       
                    hitung();
                    choose = sc.nextInt();
                    if(choose == 1){
                        pg.luasPersegi();
                    }else if(choose == 2){
                        pg.kelPersegi();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan panjang: ");
                    int p = sc.nextInt();
                    pp.setPanjang(p);
                    System.out.print("Masukkan lebar: ");
                    int l = sc.nextInt();
                    pp.setLebar(l);
                    
                    hitung();
                    choose = sc.nextInt();
                    if(choose == 1){
                        pp.luasPersegiPanjang();
                    }else if(choose == 2){
                        pp.kelPersegiPanjang();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Jari-Jari: ");
                    int r = sc.nextInt();
                    lg.setJariJari(r);
                    
                    hitung();
                    choose = sc.nextInt();
                    if(choose == 1){
                        lg.luasLingkaran();
                    }else if(choose == 2){
                        lg.kelLingkaran();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan alas: ");
                    int al = sc.nextInt();
                    jg.setAlas(al);
                    System.out.print("Masukkan tinggi: ");
                    int tg = sc.nextInt();
                    jg.setTinggi(tg);
                    
                    hitung();
                    choose = sc.nextInt();
                    if(choose == 1){
                        jg.luasJajarGenjang();
                    }else if(choose == 2){
                        System.out.print("Masukkan sisi miring: ");
                        int m = sc.nextInt();
                        jg.setC(m);
                        jg.kelJajarGenjang();
                    }
                    break;
            } 
        }while(pilih !=0);
    }  
}
