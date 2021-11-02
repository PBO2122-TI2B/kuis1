/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

import java.util.Scanner;

/**
 *
 * @author Asus X453
 */
public class tampilPersegiPanjang {
    public static void main(String[] args) {
    PersegiPanjang p = new PersegiPanjang();
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan Nilai panjang   :");
    float panjang = input.nextFloat();
    System.out.print("Masukkan Nilai lebar :");
    float lebar=input.nextFloat();

//Setter
    p.setPanjang(panjang);
    p.setLebar(lebar);

//Getter
    System.out.println();
    System.out.println("Nilai Panjang    = "+p.getPanjang());
    System.out.println("Nilai Lebar   = "+p.getLebar());
    System.out.println("==========================================");
    System.out.println();
    System.out.println("Nilai Luas Persegi Panjang Adalah = "+p.getLuasPersegiPanjang());
    System.out.println("Nilai Keliling Persegi panjang Adalah = "+p.getKelilingPersegiPanjang());
    }
}
