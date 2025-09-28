package day21;

public class Day21 {

    public static void main(String[] args) {
        // Program untuk menukar nilai dua variabel
        
        // Bagian 1 Tanpa variabel tambahan
        int a = 10;
        int b = 5;
        
        System.out.println("Bagian 1 ");
        System.out.println("Sebelum ditukar: a = " + a);
        System.out.println("Sebelum ditukar: b = " + b);
        
        // Tukar tanpa variabel tambahan (menggunkan operasi aritmatika)
        a = a + b; // 10 + 5 = 15
        b = a - b; // 15 - 5 = 10
        a = a - b; // 15 - 10 = 5
        
        System.out.println("Setelah ditukar: a = " + a);
        System.out.println("Setelah ditukar: b = " + b);
        
        // Bagian 2 Dengan satu variabel tambahan
        int h = 7;
        int i = 3;       
        
        System.out.println("\nBagian 2 ");
        System.out.println("Sebelum ditukar: h = " + h);
        System.out.println("Sebelum ditukar: i = " + i);
        
        // Tukar dengan satu variabel tambahan 
        int temp = h; // temp itu menyimpan nilai sementara
        h = i;
        i =temp;
        
        System.out.println("Setelah ditukar: h = " + h);
        System.out.println("Setelah ditukar: i = " + i);
        
    }
    
}
