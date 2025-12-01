package Day86;

import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = q.nextInt();
        int min = a[0];
        for (int i = 1; i < n; i++) if (a[i] < min) min = a[i];
        System.out.println(min);
    }
}
