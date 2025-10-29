package day52;

import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        // Perulangan while
        Scanner q = new Scanner(System.in);
        char u = 'y';
        
        while (u == 'y'){
            System.out.print("Maukkan angka: ");
            int a = q.nextInt();
            
            String h = (a % 2 != 0) ? "Ganjil" : "Genap";
            System.out.println("Angka " + a + " adalah " + h);
            System.out.print("Cek(y): ");
            u = q.next().charAt(0);
        }
            System.out.println("Selesai");
    }
    
}
