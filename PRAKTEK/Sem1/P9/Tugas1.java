package P9;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int banyak;
        System.out.print("Masukan banyak elemen: ");
        banyak = input12.nextInt();
        int [] array = new int [banyak];
        for (int i = 0; i < array.length; i++){
            System.out.print("masukan angka ke "+i+": ");
            array[i] = input12.nextInt();
        }
        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];

        for (int i = 1; i < banyak; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        double rataRata = (double) total / banyak;
        System.out.println("nilai tertinggi "+nilaiTertinggi);
        System.out.println("nilai terendah "+nilaiTerendah);
        System.out.println("Rata Rata yang diadapat ialah "+rataRata);
    }
}