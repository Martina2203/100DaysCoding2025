package day50;

import java.util.Scanner;

public class Day50 {
    
    public static void main(String[] args) {
        // Latihan membuat program ganjil genap menggunakan ternary
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = q.nextInt();
        String j = (a % 2 != 0) ? " ganjil" : " genap";
        System.out.println(a + " adalah bilangan" + j);
    }
    
}
