package day56;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {
        // Perulangan do while
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int a = q.nextInt();
        int i = 1;
        System.out.println("Bilangan genap " + a + " yaitu: ");
        do {
        if (i % 2 == 0){
            System.out.println(i);
        }
        i++;
        }while (i <= a);
       
    }
}
