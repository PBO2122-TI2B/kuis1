/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

import java.util.Scanner;

/**
 *
 * @author Asus X453
 */
public class tampilLingkaran {
        public static void main(String[] args) {
    Lingkaran p = new Lingkaran();
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan jari- jari   :");
    float jari = input.nextFloat();

//Setter
    p.setJari(jari);

//Getter
    System.out.println();
    System.out.println("Nilai jari jari    = "+p.getJari());
    System.out.println("==========================================");
    System.out.println();
    System.out.println("Nilai Luas Lingkaran Adalah = "+p.getLuasLingkaran());
    System.out.println("Nilai Keliling Lingkaran Adalah = "+p.getKelilingLingkaran());
    }

}
