package day17;

import java.util.Scanner;

public class Main {

  public static void main(String[args) {
     // Operator aritmatika modulus atau sisa bagi (%
     Scanner ip = new Scanner (System.in);

     System.out.print("Masukkan angka 1: ");
     int a = ip.nextInt();

     System.out.print("Masukkan angka 2: ");
     int b = ip.nextInt();

     int sisa = a % b;

     // Menampilkan hasil output 
     System.out.println("Sisa bagi: " + sisa);

  }

}
