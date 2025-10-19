package day42;

import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
        // Latihan menentukan gaji bersih
        Scanner q = new Scanner(System.in);
        System.out.print("Nama Pegawai: ");
        String n =q.nextLine();
        System.out.println("======== Pekerjaan ========");
        System.out.println("1. PNS");
        System.out.println("2. Freelancer");
        System.out.println("===========================");
        System.out.print("Pilih Pekerjaan: ");
        int p = q.nextInt();
        System.out.print("Penghasilan: ");
        double pe = q.nextDouble();
        
        int pa = 0;
        String jp = "";
        
        if (p == 1){
         jp = "PNS";      
         if (pe>= 5000000){
            pa = 15;
         }else if (pe >=3000000 && pe <5000000){
            pa = 10;
        } else {
            pa = 0;
        }
      } else if(p == 2) {
        jp = "Freelancer";
        if (pe >=5000000){
            pa = 8;
      } else if (pe >=3000000 && pe <5000000){
            pa = 3;
      } else {
            pa = 0;
      }
      }       
        double pot = pe * pa/100;
        double pb = pe - pot;
           System.out.println("=========================================");
           System.out.println("Nama Pegawai\t\t: " + n);
           System.out.println("Jenis Pekerjaan\t\t: " + jp);
           System.out.println("Penghasilan Kotor\t: " + pe);
           System.out.println("Pajak Dikenakan\t\t: " + pa  + "%");
           System.out.println("Potongan\t\t: " + pot);
           System.out.println("Penghasilan Bersih\t: " + pb); 
    } 
}
