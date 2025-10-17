package day40;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        // Latihan membuat kalkulator sederhana
        Scanner q = new Scanner(System.in);
        System.out.println("===== KALKULATOR SEDERHANA =====\n");
        System.out.print("Masukkan angka 1 = ");
        long s = q.nextLong();
        System.out.print("Masukkan (+ - * / %) = ");
        char o = q.next().charAt(0);
        System.out.print("Masukkan angka 1 = ");
        long k = q.nextLong();
        
        long h = 0 ;
        if (o == '+'){
        h = s + k;
        System.out.printf("Hasil =%d%n", h);
       }else if (o == '-'){
        h = s - k;
        System.out.printf("Hasil =%d%n", h);
       }else if (o == '*'){
        h = s * k;
        System.out.printf("Hasil =%d%n", h);
       }else if (o == '/'){
        h = s / k;
        System.out.printf("Hasil =%d%n", h);
       }else if (o == '%'){
        h = s % k;
        System.out.printf("Hasil =%d%n", h);
       }
         
    }
    
}
