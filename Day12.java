package day12;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        
        // Membuat program biodata sederhana
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Input Biodata====");
        
        System.out.printf("Nama Lengkap  : ");
        String nama = input.nextLine();

        System.out.printf("Umur          : ");
        int umur = input.nextInt();
        
        input.nextLine(); // Membersihkan newline
        
        System.out.printf("Alamat        : ");
        String alamat = input.nextLine();
        
        System.out.printf("Jenis Kelamin (L/P): ");
        char gender = input.next().charAt(0);
        
        input.nextLine(); // Membersihkan newline
        
        System.out.printf("Hobi          : ");
        String hobi = input.nextLine();
        
        System.out.printf("Apakah sudah nikah? (true/false): ");
        boolean sudahMenikah = input.nextBoolean();
       
        
        // Menampilkan tampilan output
        System.out.println("\n==== Biodata Diri ====");
        System.out.println("Nama Lengkap  : " + nama);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Alamat        : " + alamat);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Hobi          : " + hobi);
        System.out.println("Status        : " + sudahMenikah);
        
        /*
        Jadi disini saya menggunakan tipe data String untuk nama dan alamat, untuk tipe data int untuk umur, untuk
        tipe data char disini untuk gender dan boolean untuk status 
        */
      
    }
    
}
