/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JajarG;

import java.util.Scanner;

/**
 *
 * @author Asus X453
 */
public class tampilJajarGenjang {
    public static void main(String[] args) {
    JajarGenjang S = new JajarGenjang();
    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan Nilai Alas   :");
    float alas = input.nextFloat();
    System.out.print("Masukkan Nilai Tinggi :");
    float tinggi=input.nextFloat();
    System.out.print("Masukkan Nilai Sisi Miring :");
    float sisimiring=input.nextFloat();
    
//Setter
    S.setAlas(alas);
    S.setTinggi(tinggi);
    S.setSisimiring(sisimiring);

//Getter
    System.out.println();
    System.out.println("Nilai Alas     = "+S.getAlas());
    System.out.println("Nilai Tinggi    = "+S.getTinggi());
    System.out.println("Nilai Sisi Miring    = "+S.getSisimiring());
    System.out.println("==========================================");
    System.out.println();
    System.out.println("Nilai Luas Segitiga Adalah = "+S.getLuasJajarGenjang());
    System.out.println("Nilai Keliling Segitiga Adalah = "+S.getKelilingJajarGenjang());
    }

}
