package P6;
import java.util.Scanner;
class Pemilihan2Percobaan3_12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String kategori;
        int penghasilan,gajibBersih;
        double pajak=0;
        System.out.println("Masukan Kategori: ");
        kategori=input.nextLine();
        System.out.println("Masukan besaran penghasilan: ");
        penghasilan=input.nextInt();
        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan<=2000000){
                pajak=0.1;
            }
            else if (penghasilan>=3000000){
                pajak=0.15;
            }
            else{
                pajak=0.2;
            }
            
            
        }
        else if (kategori.equals("pebisnis")){
            if (penghasilan<=2500000){
                pajak=0.15;
            }
            else if (penghasilan>=3500000){
                pajak=0.2;
            }
            else{
                pajak=0.25;
            }
        }
        else{
            System.out.println("Kategori salah");
        }
        gajibBersih=(int)(penghasilan-(penghasilan*pajak));
        System.out.println("Gaji Bersih anda adalah " + gajibBersih);
        input.close();
        }
}
