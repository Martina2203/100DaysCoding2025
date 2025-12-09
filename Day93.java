package Day93;

import java.util.Scanner;

public class Day93 {

    public static void main(String args[]) {
        Scanner q = new Scanner(System.in);
        double x = q.nextDouble();

        System.out.println("Angka asli : " + x);
        System.out.println("Ceil       : " + Math.ceil(x));
        System.out.println("Floor      : " + Math.floor(x));
        System.out.println("Round      : " + Math.round(x));
    }
}
