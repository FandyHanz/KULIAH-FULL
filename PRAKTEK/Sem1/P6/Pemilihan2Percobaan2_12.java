package P6;
import java.util.Scanner;
class Pemilihan2Percobaan2_12 {
    public static void main(String[] args){
        Scanner input12=new Scanner(System.in);
        float sudut1,sudut2,sudut3,totalsudut;
        System.out.println("Masukan Sudut 1: ");
        sudut1=input12.nextFloat();
        System.out.println("Masukan sudut 2: ");
        sudut2=input12.nextFloat();
        System.out.println("Masukan sudut 3: ");
        sudut3=input12.nextFloat();
        totalsudut=sudut1+sudut2+sudut3;
        if (totalsudut==180){
            if ((sudut1==90)||(sudut2==90)||(sudut3==90)){
                System.out.println("segitiga siku siku");
            }
            else if((sudut1==60)||(sudut2==60)||(sudut3==60)){
                System.out.println("segitiga sama sisi");
            }
            else if ((sudut1==sudut3)||(sudut2==90)){
                System.out.println("segitiga sama kaki");
            }
            else{
                System.out.println("Segitiga sebarang");
            }
        }
        else{
            System.out.println("bukan segitiga");

        }
        input12.close();
    }
}    

