package Day88;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = q.nextInt();

        for (int x : a) System.out.println(x);
    }
}
