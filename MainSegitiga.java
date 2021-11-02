/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class MainSegitiga {
    public static void main(String[] args) {

// TODO code application logic here

Segitiga S= new Segitiga();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Alas   :");
float alas=input.nextFloat();

System.out.print("Masukkan Nilai Tinggi :");
float tinggi=input.nextFloat();
System.out.print("Masukkan Nilai Miring :");
float miring=input.nextFloat();

//Setter

S.setAlas(alas);

S.setTinggi(tinggi);
S.setMiring(miring);
//Getter

System.out.println();

System.out.println("Nilai Alas = "+S.getAlas());

System.out.println("Nilai Tinggi  = "+S.getTinggi());
System.out.println("Nilai Miring  = "+S.getMiring());

System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas Segitiga Adalah = "+S.getLuasSegitiga());
System.out.println("Nilai Luas Segitiga Adalah = "+S.getKelilingSegitiga());

}
    
}
