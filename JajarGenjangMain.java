/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number5;

import java.util.Scanner;

public class JajarGenjangMain {

    public static void main(String[] args) {
   
        JajarGenjang JG = new JajarGenjang();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Alas:");
        float alas = input.nextFloat();
        System.out.print("Masukkan Nilai Tinggi:");
        float tinggi = input.nextFloat();
        System.out.print("Masukkan Sisi Miring:");
        float sisiMiring = input.nextFloat();
        

        JG.setAlas(alas);
        JG.setTinggi(tinggi);
        JG.setSisiMiring(sisiMiring);
      
        System.out.println();
        System.out.println("Nilai Alas = "+JG.getAlas());
        System.out.println("Nilai Tinggi = "+JG.getTinggi());
        System.out.println();
        System.out.println("Nilai Luas Jajar Genjang Adalah = "+JG.getLuasJajarGenjang());
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Sisi Miring = "+JG.getsisiMiring());
        System.out.println("Nilai Keliling Segitiga Adalah = "+JG.getkelilingJajarGenjang());
        System.out.println("==========================================");

}
}
