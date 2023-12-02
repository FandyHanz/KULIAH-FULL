package P13;

import java.util.Scanner;

public class UcapanTerimakasih_12 {
    public static String result;

    public static String PenerimaUcapan() {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String NamaOrang = sc12.nextLine();
        System.out.println("Masukan pesan Tambahan: ");
        String PesanTambahan = sc12.nextLine();
        result = pesanTambahan(PesanTambahan);
        sc12.close();
        return NamaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("thank You " + nama + "  for being the best teacher in the world. \n" +
                "you inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static String pesanTambahan(String PesanTambahan) {
        String pesan = "ThankYou " + PesanTambahan;
        return pesan;
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        System.out.println("=====================");
        System.out.println("ucapan tambahan:");
        System.out.println(result);
    }
}
