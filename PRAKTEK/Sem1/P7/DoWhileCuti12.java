package P7;

import java.util.Scanner;
class DoWhileCuti12{
public static void main(String[] args){
    Scanner input12=new Scanner(System.in);
    int jatahCuti,jumlahHari;
    String konfirmasi;
    System.out.println("Jatah cuti");
    jatahCuti=input12.nextInt();
    do{
    System.out.println("apakah anda ingin mengambil cuti (y/t): ");
    konfirmasi=input12.nextLine();
    if(konfirmasi.equalsIgnoreCase("y")){
        System.out.println("Masukan hari: ");
        jumlahHari=input12.nextInt();
        if(jumlahHari<=jatahCuti){
        jatahCuti-=jumlahHari;
        System.out.println("Sisa jatah cuti "+ jatahCuti);
        }
        else{
        System.out.println("Sisa jatah cuti tidak mencukupi");
        break;
        }
    }
   }
    while(jatahCuti>0);
    input12.close();
}
}