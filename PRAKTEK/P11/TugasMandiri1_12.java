package P11;

import java.util.Scanner;
class TugasMandiri1_12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        int N ;
        System.out.print("Enter your number (minimum 3): ");
        N = input12.nextInt();
        if (N < 3){
            return;
        }else {
             for (int i = 0; i < N; i++){
                for (int j = (N - i) * 2; j >= 0; j--){
                    System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++){
                            System.out.print((j+1)+" ");
                        }
                        System.out.println();
                }
            }
            input12.close();
        } 
    }

