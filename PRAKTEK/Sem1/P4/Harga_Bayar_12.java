package P4;
import java.util.Scanner;
public class Harga_Bayar_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int harga,Jumlah,jmlHlm;
        String namaBuku;
        double total,bayar,jmlDis,dis;
        System.out.println("Masukan Merek Buku: \n");
        namaBuku=input.nextLine();
        System.out.println("Masukan Jumlah Halaman Buku: \n");
        jmlHlm=input.nextInt();
        System.out.println("Masukan Harga barang Yang ingin dibeli: \n");
        harga=input.nextInt();
        System.out.println("Masukan Jumlah Barang Yang Ingin Dibeli: \n");
        Jumlah=input.nextInt();
        System.out.println("Masukan Diskon: \n");
        dis=input.nextInt();
        total=harga*Jumlah;
        jmlDis=total*(dis/100);
        bayar=total-jmlDis;
        System.out.println("diskon Yang Anda Dapatkan"+jmlDis);
        System.out.println("Jumlah yang Harus Dibayar adalah"+bayar);
        
        input.close();
    }
}
