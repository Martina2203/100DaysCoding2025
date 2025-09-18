package day11;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Tipe data untuk String
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
       
        // Tipe data untuk byte
        System.out.print("Masukkan Umur: ");
        byte umur = input.nextByte();
        
        // Tipe data untuk short
        System.out.print("Masukkan Tinggi: ");
        short tinggi =  input.nextShort();
        
        // Tipe data untuk int
        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();
        
        // Tipe data untuk long
        System.out.print("Masukkan Lebar: ");
        long lebar = input.nextLong();
        
        // Tipe data untuk float
        System.out.print("Masukkan Berat: ");
        float berat = input.nextFloat();
        
        // Tipe data untuk double
        System.out.print("Masukkan Nilai: ");
        double nilai = input.nextDouble();
        
        // Tipe data untuk char
        System.out.print("Masukkan Huruf: ");
        char huruf = input.next().charAt(0);
        
        // Tipe data untuk boolean
        System.out.print("Masukkan boolean (true/false): ");
        boolean lulus = input.nextBoolean();
        
        
        // Menampilkan hasil output
        System.out.println("\nHasil Input ");
        System.out.println("String: " + nama);
        System.out.println("byte: " + umur + " tahun");
        System.out.println("short: " + tinggi + " cm");
        System.out.println("int: " + panjang);
        System.out.println("long: " + lebar);
        System.out.println("float: " + berat + " kg");
        System.out.println("double: " + nilai);
        System.out.println("char: " + huruf);
        System.out.println("boolean: " + lulus);
        
        input.close();
    }
    
}
