package day51;

import java.util.Scanner;

public class Day51 {

    public static void main(String[] args) {
        // Perulangan for
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan jumlah kucing: ");
        int j = q.nextInt();
        for (int k = 1; k <= j; k++){
            System.out.println("Kucing ke-" + k);
        }
    }
    
}
