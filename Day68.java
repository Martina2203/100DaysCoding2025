package Day68;

import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi: ");
        int n = q.nextInt();

        for (int i = 1; i <= n; i++) {          
            for (int j = 1; j <= n; j++) {      
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
