/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number3;

import java.util.Scanner;
import number2.Persegi;

/**
 *
 * @author ALIFIYUL
 */
public class PersegiPanjangMain {
    public static void main(String[] args) {
   
        PersegiPanjang Pl = new PersegiPanjang();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Panjang:");
        float panjang = input.nextFloat();
        System.out.print("Masukkan Nilai Lebar:");
        float lebar = input.nextFloat();
        
        Pl.setPanjang(panjang);
         Pl.setLebar(lebar);

        System.out.println();
        System.out.println("Nilai Sisi = "+Pl.getPanjang());
        System.out.println("Nilai Sisi = "+Pl.getLebar());
        System.out.println();
        System.out.println("Nilai Luas Persegi Adalah = "+Pl.getluasPersegiPanjang());
        System.out.println("Nilai Keliling Persegi Adalah = "+Pl.getkelilingPersegiPanjang());
        System.out.println("==========================================");
    }
}
