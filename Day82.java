package Day82;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        System.out.println("Semua elemen array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}
