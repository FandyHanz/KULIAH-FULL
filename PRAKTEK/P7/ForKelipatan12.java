package P7;

import java.util.Scanner;
class ForKelipatan12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int kelipatan, jumlah, counter;
        counter = 0;
        jumlah = 0;
        System.out.println("Masukan bilangan kelipatan(1-9): ");
        kelipatan = input12.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari i sampai 50 adalah %d\n", kelipatan, jumlah);
        input12.close();
    }
}
