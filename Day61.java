package Day61;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = q.nextInt();
        System.out.print("Masukkan nilai M: ");
        int m = q.nextInt();
        System.out.println("\nBilangan kelipatan " + m + " dari 1- " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }        
    }
}
