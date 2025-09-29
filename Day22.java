package day22;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {
        // Program luas persegi
         Scanner ip = new Scanner(System.in);
         
         System.out.print("Masukkan sisi persegi: ");
         int sisi = ip.nextInt();
         
         int luas = sisi * sisi;
         System.out.println("Luas persegi adalah " + luas);
         
    }
    
}
