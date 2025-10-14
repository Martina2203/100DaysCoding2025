package dav37;

import java.util.Scanner;

public class Dav37 {

    public static void main(String[] args) {
        // Menentukan bilangan ganjil atau genap
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int b = p.nextInt();
        for (int a = 1; a<=b; a++){
            if(a %2 == 0){
                System.out.println("Genap\t: " + a);
            } else 
                System.out.println("Ganjil\t: " + a);
        }
    }
    
}
