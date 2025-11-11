package Day65;

import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = q.nextInt();

        long f = 1;
        System.out.print(n + "! = ");
        for (int i = 1; i <= n; i++) {
            f *= i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + f);
    }
}
