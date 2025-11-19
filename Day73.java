package Day73;
import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        int total = 0;
        int x = 0;

        do {
            System.out.print("Masukkan angka: ");
            x = q.nextInt();

            if (x >= 0) {
                total = total + x;
            }

        } while (x >= 0);

        System.out.println("Hasil penjumlahan: " + total);
    }
}
