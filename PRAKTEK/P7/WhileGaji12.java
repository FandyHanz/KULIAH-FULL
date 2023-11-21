package P7;

import java.util.Scanner;
class WhileGaji12{
    public static void main(String[] args){
    Scanner input12= new Scanner(System.in);
    int jumlahKaryawan,jumlahJamLembur,i;
    i=0;
    double gajiLembur,totalGajilembur;
    gajiLembur=0;
    totalGajilembur=0;
    String jabatan;
    System.out.println("Masukan jumlah karyawan: ");
    jumlahKaryawan=input12.nextInt();
    while(i<jumlahKaryawan){
        System.out.println("Pilihan jabatan -Direktur,Manajer,Karyawan");
        System.out.print("Masukan jabatan karyawan ke- "+(i+1)+": ");
        jabatan=input12.next();
        System.out.println("Masukan Jumlah jam Lembur: ");
        jumlahJamLembur=input12.nextInt();
        i++;
        
        if(jabatan.equalsIgnoreCase("Direktur")){
            continue;
        }
        else if(jabatan.equalsIgnoreCase("Manajer")){
            gajiLembur=jumlahJamLembur*100000;
        }
        else if(jabatan.equalsIgnoreCase("Karyawan")){
            gajiLembur=jumlahJamLembur*75000;
        }
        totalGajilembur+=gajiLembur;
        }
    }
}