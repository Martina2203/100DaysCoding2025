package Day79;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user, pass;
        System.out.print("Buat username: ");
        user = in.nextLine();
        System.out.print("Buat password: ");
        pass = in.nextLine();

        String u, p;
        while (true) {
            System.out.print("Username: ");
            u = in.nextLine();
            System.out.print("Password: ");
            p = in.nextLine();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Salah, coba lagi.");
            }
        }
    }
}
