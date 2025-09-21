package day14;

public class Day14 {

    public static void main(String[] args) {
        // Mengubah String menjaditipe data primitif
        String a = "18";
        byte angka = Byte.parseByte(a);
        System.out.println("a = " + angka);
                
        String b = "35";
        short huruf = Short.parseShort(b);
        System.out.println("b = " + huruf);
                
        String c = "125";
        int kursi = Integer.parseInt(c);
        System.out.println("c = " + kursi); 
                
        String d = "5000";
        long rumah = Long.parseLong(d);
        System.out.println("d = " + rumah);       
                              
        String e = "35.0";
        float berat = Float.parseFloat(e);
        System.out.println("e = " + berat);         
                
        String f = "142.5";
        double tinggi = Double.parseDouble(f);
        System.out.println("f = " + tinggi);
        
        String g = "A";
        char ayam = g.charAt(0);
        System.out.println("g = " + ayam);
        
        String h = "true";
        boolean meja = Boolean.parseBoolean(h);
        System.out.println("h = " + meja);
        
        /*
        Mengubah tipe data non primtif (String) menjadi tipe data primitif adalah 
        proses konversi teks kedalam bentuk nilai numerik atau yang dapat digunakan
        dalam operasi logika        
        */
        
    }
    
}
