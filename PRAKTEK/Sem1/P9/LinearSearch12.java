package P9;

import java.util.Scanner;
public class LinearSearch12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int masukan;
        System.out.println("Masukan jumlah array: ");
        masukan = input12.nextInt();
        int [] ArrayInt = new int [masukan];
        int nilai, result = 0;
        boolean key = true;
        for (int i = 0; i < ArrayInt.length; i++){
            System.out.println("Masukan nilai ke-"+i+": ");
            ArrayInt[i] = input12.nextInt();
        }
        System.out.println("Masukan nilai yang ingin dicari");
        nilai = input12.nextInt();
        for (int i = 0; i < ArrayInt.length; i++){
            if (ArrayInt[i] == nilai){
                result = i;
                key = true;
                break;
            }else {
                key = false;
            }
         }
            if (key){
                System.out.println("nilai terdapat pada index "+result);
            }else{
                System.out.println("Nilai tidak ditemukan");
            }
        input12.close();
    }
}
