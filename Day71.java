package Day71;

import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {      
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println();          
        }
    }
}
