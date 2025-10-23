package day46;

import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        // Latihan membuat menu menggunakan switch-case 
        Scanner x = new Scanner(System.in);
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Es Teh");
        System.out.println("2. Es Jeruk");
        System.out.println("3. Pop Ice");
        System.out.println("4. Es Doger");
        System.out.print("Pilih (1-4): ");
        int p = x.nextInt();
        
        switch (p){
            case 1: 
                System.out.println("Anda memilih: Es Teh");
                System.out.println("Harga: Rp 7.000");
                break;
            case 2: 
                System.out.println("Anda memilih: Es Jeruk");
                System.out.println("Harga: Rp 10.000");
                break;
            case 3: 
                System.out.println("Anda memilih: Pop Ice");
                System.out.println("Harga: Rp 5.000");
                break;
            case 4: 
                System.out.println("Anda memilih: Es Teh");
                System.out.println("Harga: Rp 10.000");
                break;
            default: 
                System.out.println("Pilihan tidak ada");
        }
        
    }
    
}
