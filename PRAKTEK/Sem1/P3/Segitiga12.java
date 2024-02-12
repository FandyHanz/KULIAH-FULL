import java.util.Scanner;
public class Segitiga12{
public static void main(String[] args){
Scanner sc12 = new Scanner(System.in);
int alas,tinggi;
float luas;
System.out.println("Masukan nilai alas: ");
alas = sc12.nextInt();
System.out.println("Masukan nilai tinggi: ");
tinggi=sc12.nextInt();
luas=(alas*tinggi)/2;
System.out.println("Luas segitiga :"+ luas);
sc12.close();
}
}