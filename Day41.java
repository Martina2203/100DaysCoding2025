package day41;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner q = new Scanner(System.in);
      // Evaluasi mentor
      // Soal 1
      System.out.print("Masukkan suhu dalam celcius: ");
      double c = q.nextDouble();
      System.out.print("Pilih konversi: ");
      System.out.print("1. Fahrenheit ");
      System.out.print("2. Kelvin ");
      System.out.print("Masukkan pilihan: ");
      int p = q.nextInt();
      if (p == 1){
      double f = (c*9/5)+32;
      System.out.println("Hasil konversi: " + c + "°C = " + f + "F");
     }else if(p == 2){
      final double k = c + 273.15;
      System.out.println("Hasil konversi: " + c + "°C = " + k + "K");
     }

     // Soal 2
     System.out.print("Username: ");
     String u = q.nextLine();
     System.out.print("Password: ");
     String p = q.nextLine();
     if (u.equals("Tina") && p.equals("2")){
     System.out.println("Anda logis sebagai pengguna");
    }else if(u.equals("admin") && p.equals("admin")){
     System.out.println("Anda login sebagai admin");
    }else {
       System.out println("Akun tidak ditemukan");
    }

  }
}  
