package day16;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        // Operator aritmatika perkalian dan pembagian 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka 1: ");
        int angka1 = input.nextInt();
              
        System.out.print("Masukkan Angka 2: ");
        int angka2 = input.nextInt();
        
        // Operasi perkalian dan pembagian
        int kali = angka1*angka2;
        int bagi = angka1/angka2;
        
        System.out.println("Hasil Perkalian = " + kali);
        System.out.println("Hasil Pembagian = " + bagi);

    }
    
}
