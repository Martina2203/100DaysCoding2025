package day31;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        // Operator logika AND (&&)
       Scanner p = new Scanner(System.in);
       System.out.print("Masukkan umur: ");
       int a = p.nextInt();
       System.out.print("Apakah sudah dewasa?: ");
       boolean b = p.nextBoolean();
        
        if (a >= 17 && b ) {
            System.out.println("Umur kamu sudah " + a + " tahun kamu sudah dewasa" );
    } else {
            System.out.println("Umur kamu sudah " + a + " tahun kamu belum dewasa" );
        }
     
        }
    }
