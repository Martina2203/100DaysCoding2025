package day47;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        // Latihan program menentukan hari
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int a = q.nextInt();
        
        switch (a) {
            case 1:
                System.out.println("Hari ini adalah hari senin");
                break ;
            case 2:
                System.out.println("Hari ini adalah hari selasa");
                 break;
            case 3:
                System.out.println("Hari ini adalah hari rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah hari kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah hari jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah hari sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah hari minggu");
                break;
            default:  
                System.out.println("angka tidak valid");
            
            
        }
        
        
    }
}
