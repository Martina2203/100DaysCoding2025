package dav37;

import java.util.Scanner;

public class Dav37 {

    public static void main(String[] args) {
        // Menentukan bilangan ganjil atau genap
        Scanner p = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        long b = p.nextLong();
        
            if(b %2 == 1 && b < 1000){
                System.out.printf( "%d adalah bilangan ganjil dan termasuk ratusan \n" , b);
            } else if (b % 2 == 0 && b < 1000){
                System.out.println(b + " adalah bilangan genap dan termasuk ratusan ");
            } else {
                System.out.println(b + " input tidak valid ");
            }
                
        } 
    }
