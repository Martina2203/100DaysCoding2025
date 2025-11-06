package Day60;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = q.nextInt();

        System.out.println("Angka ganjil dari N-1:");
        for (int i = n - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap dari N-1:");
        for (int i = n - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
