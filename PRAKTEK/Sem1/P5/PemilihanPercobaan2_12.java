package P5;
import java.util.Scanner;
public class PemilihanPercobaan2_12 {
    public static void main(String[] args){
        Scanner input12=new Scanner(System.in);
        float total;
        int nilai;
        System.out.println("Masukan Nilai Uas: ");
        float uas=input12.nextFloat();
        System.out.println("Masukan Nilai Uts: ");
        float uts=input12.nextFloat();
        System.out.println("Masukan Nilai Kuis: ");
        float kuis=input12.nextFloat();
        System.out.println("Masukan Nilai tugas: ");
        float tugas=input12.nextFloat();
        total=(uas*0.4F+uts*0.3F+kuis*0.1F+tugas*0.2F);
        nilai=(int)total;
        if (80<nilai&&nilai<=100){
            System.out.println("A dengan Ipk setara 4, [predikat sangat baik]");
        }
        else if (73<nilai&&nilai<=80){
            System.out.println("B+ dengan Ipk setara 3.5, [predikat lebih baik dari]");
        }
        else if (65<nilai&&nilai<=73){
            System.out.println("B dengan Ipk setara 3, [predikat baik]");
        }
        else if (60<nilai&&nilai<=65){
            System.out.println("C+ dengan Ipk setara 2.5, predikat [lebih dari cukup]");
        }
        else if (50<nilai&&nilai<=60){
            System.out.println("C dengan Ipk setara 2, predikat [cukup]");
        }
        else if (39<nilai&&nilai<=50){
            System.out.println("D dengan Ipk setara 1, predikat [kurang]");
        }
        else{
            System.out.println( "E dengan Ipk setara 0, predikat [gagal]");
        }
        String Kata = (total<65)?"Remidi":"Tidak remidi";
        System.out.println("Nilai "+total+" sehingga anda "+Kata);
        input12.close();
    }
}
