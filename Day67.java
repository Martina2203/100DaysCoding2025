package Day67;

import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan panjang pola: ");
        int n = q.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        System.out.println(); 
    }
}
