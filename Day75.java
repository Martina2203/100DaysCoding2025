package Day75;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        int panjang = kalimat.length();          
        String besar = kalimat.toUpperCase();    
        String kecil = kalimat.toLowerCase();    

        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang kalimat: " + panjang);
        System.out.println("Huruf besar   : " + besar);
        System.out.println("Huruf kecil   : " + kecil);
    }
}
