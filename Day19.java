package day19;

import java.util.Scanner;

public class Day19 {

    public static void main(String[] args) {
        // Konversi manual / paksa (dari tipe besar ke kecil)
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        double angkadouble = ip.nextDouble();
        
        // konversi manual
        int angkaint = (int) angkadouble;
        short angkashort = (short) angkaint;
        byte angkabyte = (byte) angkashort;
        
        // Menampilkan hasil output
        System.out.println("\n=== Hasil Konversi Manual ===");
        System.out.println("double\t: " + angkadouble);
        System.out.println("int\t: " + angkaint);
        System.out.println("short\t: " + angkashort);
        System.out.println("byte\t: " + angkabyte);

    }
    
}
