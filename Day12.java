package day12;

public class Day12 {

    public static void main(String[] args) {
        // Membuat program biodata sederhana
        
        String nama = "Martina";
        int umur = 18;
        String alamat = "Lekopadis";
        char gender = 'P';
        String hobi = "Mendengarkan musik";
        boolean sudahMenikah = false;

        // Menampilkan tampilan output
        System.out.println("==== Biodata Diri ====");
        System.out.println("Nama Lengkap  : " + nama);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Alamat        : " + alamat);
        System.out.println("Jenis Kelamin : " + (gender == 'L'? "Laki-laki " : "Perempuan"));
        System.out.println("Hobi          : " + hobi);
        System.out.println("Status        : " + (sudahMenikah ? "Sudah Menikah " : "Belum Menikah"));
        
        /*
        Jadi disini saya menggunakan tipe data String untuk nama dan alamat, untuk tipe data int untuk umur, untuk
        tipe data char disini untuk gender dan boolean untuk status 
        */
      
    }
    
}
