package Day80;

import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] angka = new int[n];

        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        System.out.println("\nIsi Array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }
    }
}
