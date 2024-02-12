import java.util.Scanner;
class Tugas1_12 {
public static void main(String[] args) {
    Scanner sc12 = new Scanner (System.in);
    int n;
    System.out.print("enter value of n: ");
    n = sc12.nextInt();
    String catcher = DeretDescendingNumbers(n);
    System.out.print(catcher);
}
public static String DeretDescendingNumbers( int x ){
    if (x == 0){
        return "0";
    }else {
        return (x + " ")+ DeretDescendingNumbers( x - 1);
    }
}
    
}