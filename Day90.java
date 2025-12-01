package Day90;

import java.util.Scanner;

public class Day90 {

    public static void main(String args[]) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();

        int hasil = tambah(a, b);
        System.out.println(hasil);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }
}
