package Day77;

import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String s = sc.nextLine();

        String t1 = s.trim();
        String t2 = t1.substring(0, 2);
        String t3 = t1.replace(" ", "-");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
