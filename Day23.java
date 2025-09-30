package day23;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        // Program luas persegi panjang
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang persegi panjang: ");
        int p = ip.nextInt();
        System.out.print("Masukkan Lebar persegi panjang: ");
        int l = ip.nextInt();
        
        int luas = p*l;
        System.out.println("Luas persegi panjang adalah " + luas);
        
    }
    
}
