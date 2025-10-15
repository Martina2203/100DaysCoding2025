package day38;

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        // Latihan menentukan bilangan positif, negatif dan nol
        Scanner p = new Scanner(System.in);
        System.out.println("==== Menentukan Jenis Bilangan ====\n");
        System.out.print("Masukkan angka: ");
        int a = p.nextInt();
        if (a > 0){
        System.out.println(a + " adalah bilangan positif");
        }else if (a < 0){
        System.out.println(a + " adalah bilangan negatif");
        }else {
         System.out.println(a + " adalah bilangan nol");   
       }
  
    }
    
}
