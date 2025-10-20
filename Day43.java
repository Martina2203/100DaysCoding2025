package day43;

import java.util.Scanner;

public class Day43 {
    
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = q.nextInt();
        
        String jenis = "";
        if (a < 10 && a >= 1) {
            jenis = " satuan";
        } else if (a < 100) {
            jenis = " puluhan";
        } else if (a < 1000) {
            jenis = " ratusan";
        } else {
            jenis = " tidak valid";
        }
        
        String bilangan = "";
        if (a % 2 == 0) {
            bilangan = " genap";
        } else {
            bilangan = " ganjil";    
        }
        
        String bagi = "";
        if (a % 3 == 0 && a % 5 == 0) {
            bagi = " yang bisa dibagi 3 dan 5";
        } else if (a % 3 == 0) {
            bagi = " yang bisa dibagi 3";
        } else if (a % 5 == 0) {
            bagi = " yang bisa dibagi 5";
        } else {
            bagi = " yang tidak bisa dibagi 3 dan 5";
        }
        
        if (a <= 0) {
            System.out.println("Tidak bisa memasukkan angka negatif dan nol");
        } else if (a >= 1000) {
            System.out.println("Angka tidak valid (terlalu besar)");
        } else {
            System.out.println(a + " adalah angka" + jenis + bilangan + bagi);
        }
    }
}
