package day32;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        // Operator logika OR (||)
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int u = p.nextInt();
        System.out.print("Masukkan tb: ");
        long tb = p.nextLong();
        
        if (u>=17 || tb>=160){
        System.out.println("Lulus");
        } else{
        System.out.println("Tidak lulus");
        }
        
    }
    
}
