package Day74;
import java.util.Scanner;

public class class74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("===== MENU TOKO PAKAIAN =====");
            System.out.println("1. Baju");
            System.out.println("2. Celana");
            System.out.println("3. Jaket");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih: Baju");
                    System.out.println("Harga mulai dari Rp 75.000\n");
                    break;

                case 2:
                    System.out.println("Anda memilih: Celana");
                    System.out.println("Harga mulai dari Rp 120.000\n");
                    break;

                case 3:
                    System.out.println("Anda memilih: Jaket");
                    System.out.println("Harga mulai dari Rp 150.000\n");
                    break;

                case 4:
                    System.out.println("Terima kasih sudah berkunjung ke Toko Pakaian!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.\n");
            }

        } while (pilihan != 4); // Ulang terus sampai pilih keluar
    }
}
