package day15;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        // Operator Aritmatika Penjumlahan dan Pengurangan       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan Angka: ");
        int angka2 = input.nextInt();
        
        // Operasi penjumlahan dan pengurangan
        int hasilPenjumlahan = angka1+angka2;
        int hasilPengurangan = angka1-angka2;
        
        // Menampilkan hasil output
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        
    }
    
}
