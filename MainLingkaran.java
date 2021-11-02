/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lingkaran;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class MainLingkaran {
    public static void main(String[] args) {

// TODO code application logic here

lingkaran l = new lingkaran();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Pjari jari  :");
float r=input.nextFloat();

l.setjariJari(r);
System.out.println();

System.out.println("Nilai jari jari = "+l.getJariJari());


System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas lingkaran Adalah = "+l.getLuasLingkaran());
System.out.println("Nilai Keliling lingkaran Adalah = "+l.getKelilingLingkaran());

}
}
