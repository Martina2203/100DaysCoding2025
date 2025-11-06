package Day60;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = q.nextInt();

        System.out.println("Angka ganjil dari N-1:");
        for (int a = n; a >= 1; a -= 2) {
            System.out.print(a + " ");
        }

        System.out.println("\nAngka genap dari N-1:");
        for (int a = n - 1; a >= 1; a -= 2) {
            System.out.print(a + " ");
        }
    }
}
