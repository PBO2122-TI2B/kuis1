/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainKuis {
    public static void main(String abc[]){
        Scanner masuk = new Scanner(System.in);
        Luas farah = new Luas();
        
        System.out.println("-------PERHITUNGAN-------");
        System.out.println("Luas \t: "+ farah.hitungLuas());
        System.out.println("Luas \t: "+ farah.hitungLuas());
        System.out.println("Keliling \t: "+ farah.getKeliling());
        System.out.println("------------------------------------");
        System.out.println();
    }
}
