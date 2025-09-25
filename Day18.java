package day18;

import java.util.Scanner;

public class Day18 {

    public static void main(String[] args) {   
        // Konversi Otomatis (dari tipe data kecil ke besar)
        Scanner ip = new Scanner(System.in);
        
        // input angka dalam bentuk byte
        System.out.print("Masukkan angka: ");
        byte angkabyte = ip.nextByte();
        
        // konversi otomatis
        short angkashort = angkabyte;
        int angkaint = angkashort;
        long angkalong = angkaint;
        float angkafloat = angkalong;
        double angkadouble = angkafloat;
        
        // Menampilkan hasil output
        System.out.println("\n=== Hasil Konversi Otomatis ===");
        System.out.println("byte\t: " + angkabyte);
        System.out.println("short\t: " + angkashort);
        System.out.println("int\t: " + angkaint);
        System.out.println("long\t: " + angkalong);
        System.out.println("float\t: " + angkafloat);
        System.out.println("double\t: " + angkadouble);
   
    }
    
}
