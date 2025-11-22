package Day76;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata: ");
        String kata = q.nextLine();

        System.out.print("Masukkan kata pembanding: ");
        String pembanding = q.nextLine();

       // equals
        if (kata.equals(pembanding)) {
            System.out.println("equals(): Kedua kata SAMA persis.");
        } else {
            System.out.println("equals(): Kedua kata TIDAK sama persis.");
        }

        // equalsIgnoreCase()
        if (kata.equalsIgnoreCase(pembanding)) {
            System.out.println("equalsIgnoreCase(): Kedua kata sama jika tidak melihat huruf besar/kecil.");
        } else {
            System.out.println("equalsIgnoreCase(): Kata berbeda meskipun huruf besar/kecil diabaikan.");
        }

        // contains()
        if (kata.contains(pembanding)) {
            System.out.println("contains(): Kata pertama MENGANDUNG kata pembanding.");
        } else {
            System.out.println("contains(): Kata pertama TIDAK mengandung kata pembanding.");
        }

        // isEmpty()
        if (kata.isEmpty()) {
            System.out.println("isEmpty(): Kata pertama KOSONG.");
        } else {
            System.out.println("isEmpty(): Kata pertama TIDAK kosong.");
        }
    }
}
