import java.util.Scanner;
public class Tugas4_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner (System.in);
        
        System.out.print("Masukan bulan: ");
        int bulan = sc12.nextInt();
        int [] marmut = HitungMarmut(bulan);
        System.out.println("Total pasangan marmut pada bulan ke-" + bulan + " adalah " + marmut[0]);
        System.out.println("Jumlah marmut produktif pada bulan ke-" + bulan + " adalah " + marmut[1]);
        System.out.println("Jumlah marmut belum produktif pada bulan ke-" + bulan + " adalah " + marmut[2]);
    }

    public static int [] HitungMarmut(int x){
        int [] temps = new int [3];
        if (x <= 2){
            temps [0] = 1;
            temps [1] = 0;
            temps [2] = 1;
            return temps;
        }
        int [] before = HitungMarmut( x - 1);
        int totalbelumProduktif = before[0] + before[2];
        int jumlahproduktif = before[2];
        temps[0] = totalbelumProduktif;
        temps[1] = jumlahproduktif;
        temps[2] = totalbelumProduktif - jumlahproduktif;
        return temps;
    }
}
