package Day57;

import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int t = q.nextInt();

        for (int a = 1; a <= t; a++) {
            char h = 'A';
            for (int i = 1; i <= a; i++) {
                System.out.print(h + " ");
                h++;
            }
            System.out.println();
        }
    }
}
