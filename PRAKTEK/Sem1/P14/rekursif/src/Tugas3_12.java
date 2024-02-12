import java.util.Scanner;

class Tugas3_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int f, r = 2;
        System.out.print("enter value of F: ");
        f = sc12.nextInt();
      if (Checkrekursif(f, r)){
        System.out.println("bilangan ini prima");
      }else{
        System.out.println("Bilangan ini bukan prima");
      }
    }
    
    public static boolean Checkrekursif(int x, int y) {
        if (x <= 2) {
            return (x == 2);
        }
        if (x % y == 0) {
            return false;
        }
        if (y * y > x) {
            return true;
        }
        return Checkrekursif(x, y + 1);
    }
}

