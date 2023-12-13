import java.util.Scanner;

class Tugas2_12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        int f, r;

        System.out.print("enter value of f: ");
        f = sc12.nextInt();
        System.out.print("enter the border number: ");
        r = sc12.nextInt();
        int catcher = PenjumlahanRekursif(r);
        String funct = function(f, r);
        System.out.print(funct + " " + "= " + catcher);
    }

    public static int PenjumlahanRekursif(int x) {
        if (x == 0) {
            return 0;
        } else {
            int before = x + PenjumlahanRekursif(x - 1);
            return before;
        }
    }

    public static String function (int x, int y) {
        if (x == y){
            return (Integer.toString(y));
        } else {
            String result = (x + "+") + function(x + 1, y);
            return result;
        }
    }
}
