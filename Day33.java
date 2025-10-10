package day33;

import java.util.Scanner;

public class Day33 {

    public static void main(String[] args) {
        // Operator logika NOT (!)
        Scanner t = new Scanner(System.in);
        System.out.print("Apakah kamu sudah makan? (true/false): ");
        boolean makan = t.nextBoolean();
        
        if (!makan ){ // kebalikan dari nilai nnolean 
            System.out.println("Lapar ");
        } else {
            System.out.println("Kenyang ");
        }
    }
    
}
