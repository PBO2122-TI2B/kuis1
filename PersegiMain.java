/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number2;

import java.util.Scanner;
import number1.Segitiga;

/**
 *
 * @author ALIFIYUL
 */
public class PersegiMain {
    public static void main(String[] args) {
   
        Persegi P = new Persegi();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Sisi:");
        float Sisi = input.nextFloat();
        
        P.setSisiPersegi(Sisi);

        System.out.println();
        System.out.println("Nilai Sisi = "+P.getSisi());
        System.out.println();
        System.out.println("Nilai Luas Persegi Adalah = "+P.getluasPersegi());
        System.out.println("Nilai Keliling Persegi Adalah = "+P.getkelilingPersegi());
        System.out.println("==========================================");
}
}