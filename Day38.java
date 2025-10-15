package day38;

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        // Latihan menentukan bilangan positif, negatif dan nol
        Scanner p = new Scanner(System.in);
        System.out.println("==== Menentukan Jenis Bilangan ====\n");
        System.out.print("Masukkan angka: ");
        long a = p.nextLong();
        if (a > 0){
        System.out.printf("%d adalah bilangan positif%n", a);
        }else if (a < 0){
        System.out.printf("%d adalah bilangan negatif%n", a);
        }else {
         System.out.printf("%d adalah bilangan nol");   
       }
  
    }
    
}
