package P4;
import java.util.Scanner;
public class Lingkaran12 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int r;
    double keliling,luas,phi=3.14;
    System.out.println("Masukan Jari jari lingkaran: ");
    r=input.nextInt();
    keliling=2*phi*r;
    luas=phi*r*r;
    System.out.println(keliling);
    System.out.println(luas);
    input.close();
  }  
}