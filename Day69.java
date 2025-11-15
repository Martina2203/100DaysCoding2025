Package Evaluasi;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Jumlah karung: ");
        int jk = q.nextInt();
        System.out.print("Berat per karung: ");
        int bk = q.nextInt();
        
        int tb = jk * bk;
        System.out.println("Total berat " + tb);
    }
}
