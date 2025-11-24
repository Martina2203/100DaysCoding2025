package Day78;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = q.nextLine();
      
        System.out.println("Panjang kalimat: " + kalimat.length());
      
        System.out.println("Karakter pertama: " + kalimat.charAt(0));

        System.out.println("Huruf besar semua: " + kalimat.toUpperCase());

        System.out.println("Huruf kecil semua: " + kalimat.toLowerCase());

        System.out.println("Mengandung kata 'java'? " + kalimat.contains("java"));

        System.out.println("Sama persis dengan 'Hello'? " + kalimat.equals("Hello"));
       
        System.out.println("Sama (abaikan besar/kecil) dengan 'hello'? " + kalimat.equalsIgnoreCase("hello"));

        System.out.println("Mulai dengan huruf 'A'? " + kalimat.startsWith("A"));
        
        System.out.println("Berakhir dengan titik? " + kalimat.endsWith("."));
    
        if (kalimat.length() >= 5) {
            System.out.println("5 huruf pertama: " + kalimat.substring(0, 5));
        }

        System.out.println("Ganti spasi menjadi '-': " + kalimat.replace(" ", "-"));

        System.out.println("Pisah per kata:");
        String[] kata = kalimat.split(" ");
        for (String k : kata) {
            System.out.println("- " + k);
        }

        System.out.println("Menghapus spasi depan/belakang: [" + kalimat.trim() + "]");
    }
}
