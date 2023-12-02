package P13;

import java.util.Scanner;

public class Ucapan_12 {
    public static String PenerimaUcapan() {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String NamaOrang = sc12.nextLine();
        sc12.close();
        return NamaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("thank You " + nama + "\n May the force be with you");
    }
}
