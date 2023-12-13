import java.util.Scanner;

public class Percobaan3_12 {
    static double hitunglaba(double saldo, int tahun){
        if (tahun == 0){
            return (1);
        } else{
            return (1.11 * hitunglaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        double saldoawal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoawal = sc12.nextDouble();
        System.out.print("Lama inventasi (tahun): ");
        tahun = sc12.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.print(hitunglaba(saldoawal, tahun));
    }
}
