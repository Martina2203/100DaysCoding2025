package Day81;
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Masukkan indeks (0-4): ");
        int idx = sc.nextInt();

        System.out.println("Elemen pada indeks " + idx + " adalah: " + angka[idx]);
    }
}
