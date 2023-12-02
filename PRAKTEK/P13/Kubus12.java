package P13;

import java.util.Scanner;
import java.lang.Math;
public class Kubus12 {
    static int Volume(int s){
        int result = (int) Math.pow(s, 3) ;
        return result;
    }

    static int LuasPermukaan(int s){
        int result = (int) Math.pow (s, 2) * 6;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        int s, vol, LP;

        System.out.print("Masukan jumlah sisi: ");
        s = sc12.nextInt();

        vol = Volume(s);
        LP = LuasPermukaan(s);

        System.out.println("Luas permukaan dari kubus adalah: " + LP);
        System.out.println("Volume dari kubus adalah: " + vol);
    }
}