package day5;

public class Day5 {

    public static void main(String[] args) {
 
        // Ukuran 1 byte (8 bit), rentang nilai -128 sampai 127
        byte umur = 18;
        
        // Ukuran 2 byte (16 bit), rentang nilai -32768 sampai 32767
        short tb = 144;
        
        // Ukuran 4 byte (32 bit), rentang nilai -2147483648 sampai 2147483647
        int tahun = 2007;
        
        // Ukuran 8 byte (64 bit), rentang nilai -9223372036854775808 sampai 9223372036854775807
        long pulsa = 100000;
        
        
        // Menampilkan hasil output
        System.out.println("Umur saya sekarang " + umur + " tahun"); 
     
        System.out.println("Tinggi badan saya itu " + tb + " cm");
         
        System.out.println("Saya lahir pada tahun " + tahun);       
          
        System.out.println("Saya beli pulsa per bulan itu sekitar Rp " + pulsa);
        
       /*
        perbedaan dari keempat bilangan bulat (byte,short,int,long) tersebut yaitu 
        ukuran penyimpanan dan rentang nilai yang bisa disimpan berbeda-beda
        */
       
       
    }
    
}
