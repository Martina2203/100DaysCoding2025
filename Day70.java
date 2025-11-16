package Day70;

import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();

        System.out.println("\nPola Persegi Panjang:\n");

        for (int i = 1; i <= l; i++) {     
            for (int j = 1; j <= p; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
