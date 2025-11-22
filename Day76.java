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
            System.out.println("equals(): Kedua kata sama persis.");
        } else {
            System.out.println("equals(): Kedua kata tidak sama persis.");
        }

        // equalsIgnoreCase()
        if (kata.equalsIgnoreCase(pembanding)) {
            System.out.println("equalsIgnoreCase(): Kedua kata sama meskipun huruf besar atau kecil.");
        } else {
            System.out.println("equalsIgnoreCase(): Kata berbeda maka diabaikan.");
        }

        // contains()
        if (kata.contains(pembanding)) {
            System.out.println("contains(): Kata pertama ada pembanding.");
        } else {
            System.out.println("contains(): Kata pertama tidak ada kata pembanding.");
        }

        // isEmpty()
        if (kata.isEmpty()) {
            System.out.println("isEmpty(): Kata pertama kosong.");
        } else {
            System.out.println("isEmpty(): Kata pertama tidak kosong.");
        }
    }
}
