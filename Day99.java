package Day99;

import java.util.Scanner;

public class Day99 {

    static boolean prima(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0) return false;
        }
        return x > 1;
    }

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        int n = q.nextInt();

        for(int i = 1; i <= n; i++){
            if(prima(i)){
                System.out.print(i + " ");
            }
        }
    }
}
