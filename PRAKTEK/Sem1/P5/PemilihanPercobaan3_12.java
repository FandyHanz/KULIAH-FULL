package P5;
import java.util.Scanner;
public class PemilihanPercobaan3_12 {
    public static void main(String[] args){
        Scanner input12=new Scanner(System.in);
        double angka1,angka2,hasil;
        char operator;
        System.out.println("Masukan angka pertama: ");
        angka1=input12.nextDouble();
        System.out.println("masukan angka kedua: ");
        angka2=input12.nextDouble();
        System.out.println("Masukan operator (+,-,*,/): ");
        operator=input12.next().charAt(0);
        switch (operator){
            case '+':
                hasil=angka1+angka2;
                System.out.println("hasil dari "+ angka1 + "+" + angka2 + "=" + hasil);
            case '-':
                hasil=angka1-angka2;
                System.out.println("hasil dari "+ angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil=angka1*angka2;
                System.out.println("hasil dari "+ angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil=angka1/angka2;
                System.out.println("hasil dari "+ angka1 + "/" + angka2 + "=" + hasil);
                break;
            default:
                System.out.println("ERORR");
                break;
        }        
        input12.close();
    }
}

