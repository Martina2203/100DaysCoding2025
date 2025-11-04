package day58;
import java.util.Scanner;
public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();
        System.out.println("Angka 1 - N:");
        for (int a = 1; a <= n; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Angka N - 1:");
        for (int a = n; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }
}
