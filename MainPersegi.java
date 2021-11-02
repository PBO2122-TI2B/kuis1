/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persegi;

/**
 *
 * @author ASUS
 */
import java.util.*;
public class MainPersegi {
    public static void main(String[] args) {

// TODO code application logic here

persegi ps = new persegi();

Scanner input = new Scanner (System.in);

System.out.print("Masukkan Nilai sisi   :");
float sisi=input.nextFloat();



//Setter

ps.setSisi(sisi);



System.out.println();

System.out.println("Nilai Sisi = "+ps.getSisi());



System.out.println("==========================================");

System.out.println();

System.out.println("Nilai Luas persegi Adalah = "+ps.getLuaspersegi());
System.out.println("Nilai Luas persegi Adalah = "+ps.getKelilingPersegi());

}
    
}
