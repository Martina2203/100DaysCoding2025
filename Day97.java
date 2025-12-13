package Day97;

import java.util.Scanner;

public class Day97 {

    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        int s = q.nextInt();

        System.out.println("Luas : " + luasPersegi(s));
    }
}
