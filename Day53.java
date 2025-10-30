package day53;

import java.util.Scanner;

public class Day53 {

    public static void main(String[] args) {
        // Keyword break menghentikan perulangan
        Scanner q = new Scanner(System.in);
        System.out.println("Masukkan jumlah hari: ");
        int j = q.nextInt();
        
        System.out.println("Masukkan target tabungan: Rp");
        int t = q.nextInt();
        
        int h =1;
        int total = 0;
        while (h <= j){
            System.out.println("Hari ke- " + h + " menabung Rp" + t);
            total += 1000;
            if (t >= total){
                System.out.println("Tabungan mencapai Rp" + total + " di hari ke-" + h);
                break;
            }
            h++;
        }
            System.out.println("Total tabungan Rp " + total);
    }
    
}
