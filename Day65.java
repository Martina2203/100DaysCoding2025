package Day65;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = q.nextInt();

        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + f);
    }
}
