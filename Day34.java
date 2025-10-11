package day34;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        // Mengkombinasikan berbagai operator
         Scanner p = new Scanner(System.in);
         System.out.print("Nilai a = ");
         int a = p.nextInt();
         System.out.print("Nilai b = ");
         int b = p.nextInt();
         System.out.print("nilai c = ");
         int c = p.nextInt();
        
         int n = a + (b*c);
         System.out.println("Nilai akhir = " + n);
         
         int s = a - b;
       
         boolean h = (n % 2 == 0) && ((n / b > c ) || (s <= 10));
         System.out.println("Hasil logika = " + h);
         
         
         
    }
    
}
