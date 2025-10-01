package day24;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {
        // Program luas lingkaran
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = ip.nextInt();
        
        final double phi = 3.14;
        
        double luas = phi * r * r;
        System.out.println("Luas lingkaran adalah " + luas);
    }
    
}
