package Day87;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = q.nextInt();

        int cari = q.nextInt();
        boolean ketemu = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == cari) {
                ketemu = true;
                break;
            }
        }

        System.out.println(ketemu ? "Ditemukan" : "Tidak ditemukan");
    }
}
