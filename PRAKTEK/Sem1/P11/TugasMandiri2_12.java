package P11;

import java.util.Scanner;
public class TugasMandiri2_12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        System.out.print("enter number: ");
        int n = input12.nextInt();
            for (int i = 1; i <=n; i++){
                for (int j = 1; j <= n; j++){
                    if (i == 1 || i == n || j == 1 || j == n){
                        System.out.print(n + " ");;
                    }else{
                        System.out.print("  ");
                    }
                }
                 System.out.println();
            }
            input12.close();
        }
    }
