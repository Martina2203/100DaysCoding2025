package Day98;

import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        int n = q.nextInt();

        int a = 0, b = 1;

        for(int i = 1; i <= n; i++){
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
