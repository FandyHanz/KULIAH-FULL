package P9;

import java.util.Scanner;
public class ArrayRataNilai12 {
    public static void main(String[] args) {
     Scanner input12 = new Scanner (System.in);
     double total = 0;
     double rata2, rata3;
     double total1 = 0;
     int masukan, mhslulus = 0 , mhstdaklulus = 0;
     System.out.print("Masukan jumlah mahasiswa: ");
     masukan = input12.nextInt();
     int [] nilaiMhs = new int [masukan];
     for (int i = 0; i < nilaiMhs.length; i++){
        System.out.println("Masukan nilai mahasiswa ke-"+i+" :");
        nilaiMhs [i] = input12.nextInt();
     }
     for (int i = 0; i < nilaiMhs.length; i++){
        if (nilaiMhs[i] > 70){
            mhslulus++;
            total += nilaiMhs [i];
        }else if (nilaiMhs[i] < 70){
            mhstdaklulus++;
            total1 += nilaiMhs [i];
        }
     }
     rata2 = total / mhslulus;
     rata3 = total1 / mhstdaklulus;
     System.out.println("rata rata mahasiswa lulus: "+rata2);
     System.out.println("rata rata mahasiswa tidak lulus: "+rata3);
    input12.close();
    }
}
