package day52;

import java.util.Scanner;

public class Day52 {

    public static void main(String[] args) {
        // Perulangan while
        Scanner q = new Scanner(System.in);
        System.out.print("Jumlah kucing: ");
        int j = q.nextInt();
        
        int k = 1;
        while (k <= j){
            System.out.println("Kucing ke-" + k);
            k++;
        }
    }
    
}
