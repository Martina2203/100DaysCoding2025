package Day83;

import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();

        int[] angka = new int[n];
        int total = 0;
      
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
            total += angka[i];  
        }
        System.out.println("Total jumlah elemen: " + total);
    }
}
