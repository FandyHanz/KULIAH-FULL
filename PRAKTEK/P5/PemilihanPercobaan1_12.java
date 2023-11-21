package P5;
import java.util.Scanner;
public class PemilihanPercobaan1_12{
    public static void main(String[] args) {
        Scanner input12=new Scanner(System.in);
        int input;
        System.out.println("Masukan Angka: \n");
        input=input12.nextInt();
        System.out.println("Bilangan anda" + input + "maka hasilnya ialah");
        String hasil=(input%2==0)?"Genap":"Ganjil";
        System.out.println(hasil);
        input12.close();
    }
}