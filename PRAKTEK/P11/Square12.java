
package P11;

import java.util.Scanner;
public class Square12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int N = 0;
        System.out.print("Masukan jumlah N: ");
        N = sc12.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++){
            for(int i = 0; i <= N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc12.close();
    }
}
