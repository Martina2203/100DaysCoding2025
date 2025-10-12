package day35;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        // Percabangan (if)
        Scanner p = new Scanner(System.in);
        System.out.print("Masukan Umur: ");
        int u = p.nextInt();     
       
        if (u >=17) {
            System.out.println("Kamu sudah dewasa ");
        } else {
            System.out.println("Kamu belum dewasa");
        }
            
        
    }
    
}
