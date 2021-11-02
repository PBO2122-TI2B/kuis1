/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi;

import java.util.Scanner;

/**
 *
 * @author Asus X453
 */
public class TampilPersegi {
      public static void main(String[] args) {
    Persegi p1 = new Persegi();
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan Nilai Sisi   :");
    double sisi = input.nextDouble();

//Setter
    p1.setSisi(sisi);

//Getter
    System.out.println();
    System.out.println("Nilai Sisi     = "+p1.getSisi());
    System.out.println("==========================================");
    System.out.println();
    System.out.println("Luas Persegi Adalah = "+p1.getLuasPersegi());
    System.out.println("Keliling Persegi Adalah = "+p1.getKelilingPersegi());
    }
}