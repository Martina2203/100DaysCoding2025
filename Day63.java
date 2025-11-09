package Day63;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = q.nextInt();

        long h = 1;
        for (int i = 1; i <= n; i++) {
            h *= i;
        }

        System.out.println("Hasil perkalian 1 sampai " + n + " = " + h);
    }
}
