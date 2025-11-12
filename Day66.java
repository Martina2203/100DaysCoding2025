package Day66;

import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        // membuat pola vertikal garis lurus

        System.out.print("Masukkan angka : ");
        int a = p.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("|");
        }
    }
}
