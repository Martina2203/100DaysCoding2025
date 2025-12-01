package Day85;

import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("jumlah elemen array: ");
        int n = q.nextInt();

        int[] a = new int[n];

        System.out.println("elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            a[i] = q.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("\nAngka maksimal: " + max);
    }
}
