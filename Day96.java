import java.util.Scanner;

public class Day96 {

    static int tambah(int a, int b){
        return a + b;
    }

    static int kurang(int a, int b){
        return a - b;
    }

    static int kali(int a, int b){
        return a * b;
    }

    static int bagi(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        int x = q.nextInt();
        int y = q.nextInt();

        System.out.println("Tambah : " + tambah(x, y));
        System.out.println("Kurang : " + kurang(x, y));
        System.out.println("Kali   : " + kali(x, y));
        System.out.println("Bagi   : " + bagi(x, y));
    }
}
