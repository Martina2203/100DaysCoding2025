// Nomor 1

   // File 1
package evaluasi13;

 
import java.util.Scanner;

    // file 2
public class Evaluasi13 {

    // File 3
    public static void main(String[] args) {
        

// Nomor 2
      
      // Deklarasi adalah tempat untuk membuat tipe data dan nama variabel
      String nama;
      byte umur;
      short lebar;
      int panjang;
      long jumlahpenduduk;
      float bb;
      double tb;
      char nilai;
      boolean lulus;
      
      // Inisialisasi adalah car unutk membuat atau mengisihkan nilaikepada nama variabel
      nama = "Martina";
      umur = 18;
      lebar = 32;
      panjang = 500;
      jumlahpenduduk = 12000000;
      bb = 35.5f;
      tb = 142.5;
      nilai = 'A';
      lulus = true;
      
      // Update  variabel adalah mengubah nilai variabel yang sudah dibuat
      nama = "Tina";
      umur = 20;
      lebar = 44;
      panjang = 700;
      jumlahpenduduk = 500000000;
      bb = 45.0f;
      tb = 150.0;
      nilai = 'C';
      lulus = false;
      
      
 // Nomor 3
    
      Scanner input = new Scanner(System.in);
        String Nama;
        int Umur;
        String nim;
        boolean status;
        double Tb;
        float Bb;
        char kelas;
        String alamat;
        
        System.out.print("nama:");
        Nama = input.nextLine();
        
        System.out.print("Umur:");
        Umur = input.nextInt();
        
        input.nextLine();
        
        System.out.print("nim:");
        nim = input.nextLine();     
        
        System.out.print("status:");
        status = input.nextBoolean();
        
        System.out.print("tb:");
        Tb = input.nextDouble();
        
        System.out.print("bb:");
        Bb = input.nextFloat();
        
        System.out.print("kelas:");
        kelas = input.next().charAt(0);
        
        input.nextLine();
        
        System.out.print("alamat:");
        alamat = input.nextLine();
        
        System.out.print("\n===== Biodata Mahasiswa =====");
        System.out.print("\nNama\t\t:\t" + Nama);
        System.out.print("\nUmur\t\t:\t" + Umur + " Tahun");
        System.out.print("\nNIM\t\t:\t" + nim);
        System.out.print("\nStatus\t\t:\t" + status);
        System.out.print("\nTinggi Badan\t:\t" + Tb + " cm");
        System.out.print("\nBerat Badan\t:\t" + Bb + " kg");
        System.out.print("\nKelas\t\t:\t" + kelas);
        System.out.print("\nAlamat\t\t:\t" + alamat + "\n");      
     
    }
    
}
