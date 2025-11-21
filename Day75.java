package Day75;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = q.nextLine();

        int p = kalimat.length();          
        String b = kalimat.toUpperCase();    
        String k = kalimat.toLowerCase();    

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang kalimat: " + p);
        System.out.println("Huruf besar   : " + b);
        System.out.println("Huruf kecil   : " + k);
    }
}
