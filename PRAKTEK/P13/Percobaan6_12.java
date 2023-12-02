package P13;

import java.util.Scanner;

public class Percobaan6_12 {
    
    static int hitungLuas(int p, int l) {
        int Luas = p * l;
        return Luas;
    }

    static int hitungVolume(int p, int l, int t) {
        int vol = p * l * t;
        return vol;
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukan Panjang: ");
        p = sc12.nextInt();
        System.out.println("Masukan Lebar: ");
        l = sc12.nextInt();
        System.out.println("Masukan Tinggi: ");
        t = sc12.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi adalah " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume dari balok " + vol);

    }

}
