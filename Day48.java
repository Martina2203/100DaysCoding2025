package day48;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        // Latihan membuat kalkulator menggunakan switch-case
        Scanner q = new Scanner(System.in);
        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.print("Masukkan angka 1 = ");
        int a1 = q.nextInt();
        System.out.print("Masukkan operator: ");
        char op = q.next().charAt(0);
        System.out.print("Masukkan angka 2 = ");
        int a2 = q.nextInt();
        int ha = 0;
        switch(op){
            case '+':
                ha = a1 + a2;
                System.out.println("Hasil = " + ha);
                break;
            case '-':
                ha = a1 - a2;
                System.out.println("Hasil = " + ha);
                break;
            case '*':
                ha = a1 * a2;
                System.out.println("Hasil = " + ha);
                break;                  
            case '/':
                ha = a1 / a2;
                System.out.println("Hasil = " + ha);
                break;
            case '%':
                ha = a1 % a2;
                System.out.println("Hasil = " + ha);
                break;
            default :            
                System.out.println("Tidak valid");
        }
        
    }
    
}
