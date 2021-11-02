/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Mainpersegipanjang {
    public static void main(String[] args) {

// TODO code application logic here

persegipanjang pp = new persegipanjang();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai Panjang  :");
float panjang=input.nextFloat();
System.out.print("Masukkan Nilai Lebar  :");
float lebar=input.nextFloat();


//Setter

pp.setPanjang(panjang);
pp.setLebar(lebar);



System.out.println();

System.out.println("Nilai Panjang = "+pp.getPanjang());
System.out.println("Nilai Lebar = "+pp.getLebar());




System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas persegi panjang Adalah = "+pp.getLuaspersegipanjang());
System.out.println("Nilai Keliling persegi panjang Adalah = "+pp.getKelilingPersegipanjang());

}
    
}
