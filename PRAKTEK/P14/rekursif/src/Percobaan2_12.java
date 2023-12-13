import java.util.Scanner;

public class Percobaan2_12 {
    static int hitungPangkat(int x, int y) {
        int n = 1;
        if (y == 0) {
            return (n);
        } else {
            int before = (x * hitungPangkat(x, y - 1));
            return before;
        }
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc12.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc12.nextInt();
        System.out.println("=================================");
        System.out.println("hasil: ");
        int catcher = hitungPangkat(bilangan, pangkat);
        String catchering = initialize(bilangan, pangkat);
        System.out.println( bilangan + catchering +"" + " = " + catcher);
    }

    public static String  initialize(int x, int y){
        
      
        if (y == 1){
            return ("x" + 1);
        }else{
            String recursive = ("x" + x) + initialize(x, y - 1);
            return recursive;
        }

    }
}
