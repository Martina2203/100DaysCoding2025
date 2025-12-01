package Day93;

import java.util.Scanner;

public class Day93 {

    public static void main(String args[]) {
        Scanner q = new Scanner(System.in);
        double x = q.nextDouble();

        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.round(x));
    }
}
