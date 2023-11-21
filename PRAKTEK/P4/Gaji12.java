package P4;
import java.util.Scanner;
public class Gaji12 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int jmlMasuk,jmlTidakmasuk,TotGaji,Gaji,potGaji;
   System.out.println("Masukan Jumlah masuk \n");
   jmlMasuk=input.nextInt();
   System.out.println("Masukan Jumlah Tidak Masuk \n");
   jmlTidakmasuk=input.nextInt();
   System.out.println("Masukan Gaji: \n");
   Gaji=input.nextInt();
   System.out.println("Masukan Potongan Gaji: \n");
   potGaji=input.nextInt();
   TotGaji=(jmlMasuk*Gaji)-(jmlTidakmasuk*potGaji);
   System.out.println(TotGaji);
   input.close();
}   
}