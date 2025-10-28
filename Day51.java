package day51;

import java.util.Scanner;

public class Day51 {

    public static void main(String[] args) {
        // Perulangan for
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka negatif: ");
        int n = q.nextInt();
        System.out.print("Masukkan angka positif: ");
        int p= q.nextInt();
        for (int a = n; a <= p; a++){
        String h = (a < 0)? " Negatif" : (a > 0) ? " Positif" : "Nol";
        System.out.println(a + " adalah bilangan " + h);
        }
    }
    
}
