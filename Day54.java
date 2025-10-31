package day54;

import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {
        // Keyword continue
        Scanner q = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jm = q.nextInt();
        int tv, jv, jtv, nk, nb;
        tv = 0;
        jv = 0;
        jtv = 0;
        nk = 100;
        nb = 0;
        
        for (int a = 1; a <= jm; a++){
            System.out.print("Nilai ke" + a + ": ");
            int n = q.nextInt();
            
            if (n < 0 || n > 100){
                System.out.println("Nilai tidak valid dan tidak di proses");
                jtv++;
                continue;
            }
                tv += n;
                jv++;       
                
                if (n < nk){
                nk = n;
                }
                
                if (n > nb){
                nb = n;
                }
        }
         
        System.out.println("Total nilai valid\t: " + tv);
        System.out.println("Jumlah nilai valid\t: " + jv);
        System.out.println("Jumlah nilai tidak valid: " + jtv);

        double rata = (double) tv/ jv;
        System.out.println("Nilai valid terkecil\t: " + nk);
        System.out.println("Nilai valid terbesar\t: " + nb);
        System.out.println("Rata-rata nilai valid\t: " + rata);         
        } 
    }
