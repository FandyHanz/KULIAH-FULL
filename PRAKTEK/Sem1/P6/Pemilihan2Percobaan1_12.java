package P6;
import java.util.Scanner;
class Pemilihan2Percobaan1_12 {
    public static void main(String[] args){
        Scanner input12=new Scanner(System.in);
        int tahun;
        System.out.println("Masukan tahun: "); 
        tahun=input12.nextInt();
        if (tahun%4==0){
         if (tahun%100!=0) {
             System.out.println("Kabisat");
         }
         else if(tahun%400==0){
            System.out.println("Tahun "+ tahun + " Tahun kabisat");
         }
         else{
            System.out.println("Tahun "+ tahun + " Bukan Tahun Kabisat");
         }
        }
        else{
         System.out.println("Non Kabisat");
        }
        input12.close();
    }
}   
    
