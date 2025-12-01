package Day92;

import java.util.Scanner;

public class Day92 {

    public static void main(String args[]) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();

        int hasil = jumlah(a, b);
        System.out.println(hasil);
    }

    public static int jumlah(int x, int y) {
        return x + y;
    }
}
