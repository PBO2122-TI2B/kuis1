/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number4;

import java.util.Scanner;
import number2.Persegi;

/**
 *
 * @author ALIFIYUL
 */
public class LingkaranMain {
    public static void main(String[] args) {
   
        Lingkaran li = new Lingkaran();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Jari-jari:");
        float r = input.nextFloat();
        
        li.setJariJari(r);

        System.out.println();
        System.out.println("Nilai Jari Jari : = "+li.getJariJari());
        System.out.println();
        System.out.println("Nilai Luas Lingkaran Adalah = "+li.getLuasLingkaran());
        System.out.println("Nilai Keliling Lingkaran Adalah = "+li.getKelilingLingkaran());
        System.out.println("==========================================");
}
}
