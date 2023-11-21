package P11;

import java.util.Scanner;

public class NestedLoop_2341720165 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        double[][] temps = new double[5][7];

        double [] sum = new double [5];
        double [] average = new double [5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc12.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++){
            for (int j = 0; j < temps[0].length; j++) {
               sum [i]+=temps[i][j]; 
               average[i] = sum [i]/ temps[0].length;
            }
            System.out.println("rata rata "+(i+1)+": " +average[i]);
        }
          
        sc12.close();
    }
}