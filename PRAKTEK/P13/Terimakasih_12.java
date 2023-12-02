package P13;

public class Terimakasih_12 {
    public static void UcapanTerimaKasih (){
        System.out.println("Thank you for being the best teacher in the world. \n" + 
        "you inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void UcapanTambahan (String Ucapan){
        System.out.println(Ucapan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
        String Ucapan = "Terimakasih Pak.. BU.. Semoga sehat selalu";
        UcapanTambahan(Ucapan);
    }
}
