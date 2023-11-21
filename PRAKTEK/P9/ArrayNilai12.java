package P9;

import java.util.Scanner;
public class ArrayNilai12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int [] NilaiAkhir = new int [10];
        for (int i = 0; i < NilaiAkhir.length; i++){
            System.out.println("Masukan Nilai akhir-ke "+i+": ");
            NilaiAkhir[i] = input12.nextInt();
        }
        for (int i = 0; i < NilaiAkhir.length; i++){
            if (NilaiAkhir[i] > 70){
                System.out.println("Siswa ke-"+i+" lulus! ");
            }else if(NilaiAkhir[i] < 70){
                System.out.println("Siswa ke-"+i+" tidak lulus! ");
            }
        }
        input12.close();
    }
}
