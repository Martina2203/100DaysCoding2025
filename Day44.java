package day44;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        // Latihan program predikat nilai (A,B,C,D,E)
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nm = q.nextLine();
        System.out.print("Masukkan Nilai: ");
        int n = q.nextInt();
        
        System.out.println("\n=================================");
        String Predikat;
        String Ket;
        if (n >= 85 && n <=100){
        Predikat = "A";
        Ket = "Baik Sekali";
        }else if (n >= 75){
        Predikat = "B";
        Ket = "Baik";
        }else if (n >= 65){
        Predikat = "C";
        Ket = "Cukup";
        }else if (n >= 50){
        Predikat = "D";
        Ket = "Kurang";
        }else {
        Predikat = "E";
        Ket = "Gagal";
        }
        
        System.out.println("Nama \t\t: " + nm);
        System.out.println("Nilai \t\t: " + n);
        System.out.println("Predikat\t: " + Predikat);
        System.out.println("Keterangan\t: " + Ket);
        
        System.out.println("=================================");
    }
    
}
