package Day64;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int M = q.nextInt();

        System.out.print("Masukkan N: ");
        int N = q.nextInt();

        long h = 1;
        for (int i = 1; i <= N; i++) {
            h *= M;
        }

        System.out.println(M + " pangkat " + N + " = " + h);
    }
}
