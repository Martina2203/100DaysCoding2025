package day30;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
        // Operator perbandingan <= >=
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka 1: ");
        int a = ip.nextInt();
        System.out.print("Masukkan angka 2: ");
        int b = ip.nextInt();
        System.out.println(a <= b);
        System.out.println(a >= b);
    }
    
}
