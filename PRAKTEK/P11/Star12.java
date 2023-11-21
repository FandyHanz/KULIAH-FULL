package P11;

import java.util.Scanner;
public class Star12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        int N = 0;

        System.out.print("Masukan Nilai N: ");
        N = sc12.nextInt();
            for (int i = 1; i <= N; i--){
                System.out.print("*");
            }
        sc12.close();
    }
}