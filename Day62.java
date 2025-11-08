package Day62;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = q.nextInt();

        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }

        System.out.println("Jumlah 1 sampai " + n + " = " + s);
      
    }
}
