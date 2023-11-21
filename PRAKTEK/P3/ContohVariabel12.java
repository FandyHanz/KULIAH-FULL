public class ContohVariabel12{
    public static void main(String[] args){
        String hobby= "Bermain Petak Umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(hobby);
        System.out.println("ApakahPandai?"+ isPandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("saya ber ipk %s", "dengan tinggi %s",$ipk,tinggi));
      
    }
}