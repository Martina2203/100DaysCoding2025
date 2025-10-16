package day39;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        // Membuat menu menggunkan if
        Scanner a = new Scanner(System.in);
        System.out.println("==== TOKO PAKAIAN ====");
        System.out.println("1. Kaos - 35000");
        System.out.println("2. Celana - 75000");
        System.out.println("3. Kemeja - 50000");
        System.out.println("4. Rok - 100000");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
        int p = a.nextInt();
        
        int h;
        String nb;
        
        if (p == 1){
        nb = "Kaos";
        h = 35000;
            System.out.print("Masukkan jumlah yang mau dibeli: ");
        int j = a.nextInt();
        int t = h * j;
            System.out.println("Total harga: Rp" + t);        
      } else if (p == 2){
        nb = "Celana";
        h = 75000;
            System.out.print("Masukkan jumlah yang mau dibeli:");
        int j = a.nextInt();
        int t = h * j;
            System.out.println("Total harga: Rp" + t);  
      } else if (p == 3){
        nb = "Kemeja";
        h = 50000;
            System.out.print("Masukkan jumlah yang mau dibeli:");
        int j = a.nextInt();
        int t = h * j;
            System.out.println("Total harga: Rp" + t);  
      } else if (p == 4){
        nb = "Rok";
        h = 100000;
            System.out.print("Masukkan jumlah yang mau dibeli:");
        int j = a.nextInt();
        int t = h * j;
      } else if (p == 0){
            System.out.println("Terima kasih karena telah berkunjung");
      } else {
            System.out.println("Pilihan tidak valid");     
      }
          
    }
    
}
