/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number1;

import java.util.Scanner;
public class SegitigaMain {
    public static void main(String[] args) {
   
        Segitiga S = new Segitiga();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Alas:");
        float alas = input.nextFloat();
        System.out.print("Masukkan Nilai Tinggi:");
        float tinggi = input.nextFloat();
        System.out.print("Masukkan sisi A:");
        float sisiA = input.nextFloat();
        System.out.print("Masukkan sisi B:");
        float sisiB = input.nextFloat();
        System.out.print("Masukkan sisi C:");
        float sisiC = input.nextFloat();

        S.setAlas(alas);
        S.setTinggi(tinggi);
        S.setsisiA(sisiA);
        S.setsisiB(sisiB);
        S.setsisiC(sisiC);
        System.out.println();
        System.out.println("Nilai Alas = "+S.getAlas());
        System.out.println("Nilai Tinggi = "+S.getTinggi());
        System.out.println();
        System.out.println("Nilai Luas Segitiga Adalah = "+S.getLuasSegitiga());
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Sisi A = "+S.getsisiA());
        System.out.println("Sisi B = "+S.getsisiB());
        System.out.println("Sisi C = "+S.getsisiC());
        System.out.println("Nilai Keliling Segitiga Adalah = "+S.getkelilingSegitiga());
        System.out.println("==========================================");

}

}
