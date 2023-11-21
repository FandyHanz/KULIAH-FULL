package P10;

import java.util.Scanner;
public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int baris, kolom;
        String nama,next;
        boolean cont = true;

        String [][] penonton  = new String [4][2];

       while(cont){
        System.out.println("Masukan menu: ");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan Daftar Penonton");
        System.out.println("3. Exit");
        System.out.print("menu: ");
        next = input12.nextLine();
        switch (next){
            case("1"):

        while (true){
           
            System.out.print("Masukan Nama: ");
            nama = input12.nextLine();
            System.out.print("Masukan baris: ");
            baris = input12.nextInt();
            System.out.print("Masukan Kolom: ");
            kolom = input12.nextInt();
                input12.nextLine();
                if (penonton[baris-1][kolom-1] != null){
                    System.out.println("kursi sudah terisi silahkan isi kolom lain");
                    break;
                } else if(baris > penonton.length && kolom > penonton[baris-1].length){
                    System.out.println("Kursi tidak tersedia");
                    break;
                } else{
                    penonton[baris-1][kolom-1] = nama;
                }

            penonton[baris-1][kolom-1] = nama;
            System.out.print("input penonton lainnya (y/n): ");
            next = input12.nextLine();

                if (next.equalsIgnoreCase("n")){
                    break;
                }
        }
            break;
            case ("2"):
            if (penonton != null){
                for (int i = 0; i < penonton.length; i++){
                    System.out.println("penonton ke-"+(i+1)+": "+String.join(",", penonton[i]).replaceAll("null", "***"));
                }
            }
            break;
            case("3"):
            cont = false;
            break;
        }
    }
        input12.close();
    }
}