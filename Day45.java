package day45;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        // Percabangan (switch-case)
        Scanner q = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int a = q.nextInt();
        
        switch (a){
            case 1:
                System.out.println("Hari ini hari Senin");
                break;
            case 2:
                System.out.println("Hari ini hari Selasa");
                break;
            case 3: 
                System.out.println("Hari ini hari Rabu"); 
                break;
            case 4: 
                System.out.println("Hari ini hari Kamis");
                break;
            case 5:
                System.out.println("Hari ini hari Jumat");
                break;
            case 6:
                System.out.println("Hari ini hari Sabtu");
                break;
            case 7:
                System.out.println("Hari ini hari Minggu");
                break;
            default:
                System.out.println("Angka tidak sesuai");
        }
        
        
    }
    
}
