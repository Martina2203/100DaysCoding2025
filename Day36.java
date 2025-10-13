package day36;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        // Nested if 
        Scanner p = new Scanner(System.in);
        System.out.println("======Daftar Merek Kipas=====");
        System.out.println("1. Cosmos");
        System.out.println("2. Miyako");
        
        System.out.print("Masukkan pilihan : ");
        int merek = p.nextInt();
        
        if (merek == 1 ){
        System.out.println("\n===== Daftar Model Cosmos=====");
        System.out.println("1. Cosmos DC");
        System.out.println("2. Cosmos WO");
        
        System.out.print("Masukkan pilihan : ");
        int model = p.nextInt();
        
        if ( model == 1)  {          
        System.out.println("\n====Spesifikasi=====");
        System.out.println("Merek : Cosmos DC");
        System.out.println("Tipe  : Berdiri");
        }else if (model == 2){
        System.out.println("\n====Spesifikasi=====");
        System.out.println("Merek : Cosmos WO");
        System.out.println("Tipe  : Dinding");
        }else {
        System.out.println("\nMerek tidak tersedia");
        } 
        
        
        }else if (merek == 2) {
        System.out.println("\n===== Daftar Model Miyako=====");
        System.out.println("1. Miyako KAS");
        System.out.println("2. Miyako KAD");
        
        System.out.print("Masukkan pilihan : ");
        int model = p.nextInt();
        
        if ( model == 1)  {
        System.out.println("\n====Spesifikasi=====");
        System.out.println("Merek : Miyako KAS");
        System.out.println("Tipe  : Berdiri");
        }else if (model == 2){
        System.out.println("\n====Spesifikasi=====");
        System.out.println("Merek : Miyako KAD");
        System.out.println("Tipe  : Meja");
        }else {
        System.out.println("\nMerek tidak tersedia");
        } 
        } 
    }
    
}
