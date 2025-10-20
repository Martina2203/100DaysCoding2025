package day43;

import java.util.Scanner;

public class Day43 {
    
    public static void main(String[] args) {
        // Latihan program kelipatan 3,5,3 dan 5
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = q.nextInt();
        
        String jenis = "";
        if (a < 10) {
        jenis = " satuan";
        }else if (a < 100){
        jenis = " puluhan";
        } else{
        jenis = " ratusan";
        }
        
        String bilangan = "";
        if (a % 2 == 0){
        bilangan = " genap";
        }else{
        bilangan = " ganjil";    
        }
        
        String bagi = "";
        if (a % 3 == 0 && a % 5 == 0){
        bagi = " yang bisa di bagi 3 dan 5";
        }else if (a % 3 == 0){
        bagi = " yang bisa di bagi 3";
        }else if (a % 5 == 0){
        bagi = " yang bisa di bagi 5";
        }else{
        bagi = " yang tidak bisa di bagi 3 dan 5";
        }
        
        System.out.println(a + " adalah angka" + jenis + bagi);
    }
    
}
