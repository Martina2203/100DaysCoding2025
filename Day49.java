package day49;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        // Operator ternary
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = q.nextInt();
        String h = (a >= 0)? " Positif" : " Negatif";
        System.out.println("Angka " + a + " adalah " + h);
    }
    
}
