package Day95;

import java.util.Scanner;

public class Day95 {

    public static void main(String args[]) {
        Scanner q = new Scanner(System.in);
        String teks = q.nextLine();
        int n = q.nextInt();
        cetak(teks, n);
    }

    public static void cetak(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }
}
